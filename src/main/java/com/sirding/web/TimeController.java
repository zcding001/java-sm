package com.sirding.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sirding.core.utils.DateUtil;
import com.sirding.domain.SimpleJson;
/**
 * @Described			: 
 * @project				: com.sirding.web.RandomController
 * @author 				: zc.ding
 * @date 				: 2016年12月3日
 */
@Controller
public class TimeController {
	private final Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	private MessageSendingOperations<String> messageSendingOperations;

	@RequestMapping("toTime")
	public String toRandom(){
		return "ws/time";
	}
	
	@MessageMapping("/time")
	@SendToUser(value = "/topic/getTime")
	public SimpleJson getRandom(SimpleJson simpleJson){
		logger.debug("接收到客户端的数据信息：" + simpleJson.getName());
		SimpleJson json = new SimpleJson("zc.ding", new SimpleJson("time", DateUtil.getDate()));
		return json;
	}
	
	@Scheduled(fixedDelay = 10000)
	public void sendMsg(){
		if(this.messageSendingOperations != null){
			logger.debug(this.messageSendingOperations.getClass().toString());
			this.messageSendingOperations.convertAndSend("/topic/getTime", new SimpleJson("time", DateUtil.getDate()));
		}
	}
}
