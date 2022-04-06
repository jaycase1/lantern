package com.lamp.lantern.bussiness.operator.entity;

import com.lamp.lantern.bussiness.domain.*;

import java.util.Date;

public class LoginRecord {

    /**
     * 登录记录Id
     */
    private Long loginRecordId;

    /**
     * 登录用户Id
     */
    private Long loginUserId;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 退出时间
     */
    private Date exitTime;

    /**
     * 登录地址
     */
    private String loginAddress;

    /**
     * 登录Ip
     */
    private String loginIp;

    /**
     * 登录设备
     */
    private LoginDevice loginDevice;

    /**
     * 登录设备型号
     */
    private String loginDeviceModel;

    /**
     * 登录操作系统
     */
    private OperateSystem loginSystem;

    /**
     * 用户登录方式
     */
    private LoginWay loginWay;

    /**
     * 用户登录终端
     */
    private LoginTerminal loginTerminal;

    /**
     * 用户退出方式
     */
    private QuitWay quitWay;

    /**
     * 第三方表Id
     */
    private Long triId;


}
