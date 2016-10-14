package com.sirding.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table addres_info
 *
 * @mbg.generated do_not_delete_during_merge Fri Sep 23 09:06:37 CST 2016
 */
public class AddresInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column addres_info.id
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column addres_info.user_id
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column addres_info.tel
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column addres_info.address
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column addres_info.nums
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    private BigDecimal nums;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table addres_info
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column addres_info.id
     *
     * @return the value of addres_info.id
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column addres_info.id
     *
     * @param id the value for addres_info.id
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column addres_info.user_id
     *
     * @return the value of addres_info.user_id
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column addres_info.user_id
     *
     * @param userId the value for addres_info.user_id
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column addres_info.tel
     *
     * @return the value of addres_info.tel
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column addres_info.tel
     *
     * @param tel the value for addres_info.tel
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column addres_info.address
     *
     * @return the value of addres_info.address
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column addres_info.address
     *
     * @param address the value for addres_info.address
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column addres_info.nums
     *
     * @return the value of addres_info.nums
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public BigDecimal getNums() {
        return nums;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column addres_info.nums
     *
     * @param nums the value for addres_info.nums
     *
     * @mbg.generated Fri Sep 23 09:06:37 CST 2016
     */
    public void setNums(BigDecimal nums) {
        this.nums = nums;
    }
}