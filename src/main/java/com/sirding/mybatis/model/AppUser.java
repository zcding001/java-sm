package com.sirding.mybatis.model;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table app_user
 *
 * @mbg.generated do_not_delete_during_merge Tue Oct 18 23:45:55 CST 2016
 */
public class AppUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.id
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   登录名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.login_name
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    private String loginName;

    /**
     * Database Column Remarks:
     *   登录密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.login_pwd
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    private String loginPwd;

    /**
     * Database Column Remarks:
     *   运行状态 0：禁用  1：启用 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.status
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    private Byte status;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_user.note
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_user
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.id
     *
     * @return the value of app_user.id
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.id
     *
     * @param id the value for app_user.id
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.login_name
     *
     * @return the value of app_user.login_name
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.login_name
     *
     * @param loginName the value for app_user.login_name
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.login_pwd
     *
     * @return the value of app_user.login_pwd
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.login_pwd
     *
     * @param loginPwd the value for app_user.login_pwd
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.status
     *
     * @return the value of app_user.status
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.status
     *
     * @param status the value for app_user.status
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_user.note
     *
     * @return the value of app_user.note
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_user.note
     *
     * @param note the value for app_user.note
     *
     * @mbg.generated Tue Oct 18 23:45:55 CST 2016
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}