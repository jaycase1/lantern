package com.lamp.lantern.bussiness.operator.entity;

import com.lamp.lantern.bussiness.domain.RoleType;
import com.lamp.lantern.bussiness.domain.ThirdType;

import java.util.Date;

public class ThirdInfo {

    /**
     * 第三方信息表Id
     */
    private Long thirdId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 第三方类型
     */
    private ThirdType thirdType;

    /**
     * 第三方平台Id
     */
    private int thirdPlatformId;

    /**
     * 第三方软件Id
     */
    private int thirdSoftwardId;

    /**
     * 第三方平台名字
     */
    private String thirdPlatformName;

    /**
     * 第三方软件名字
     */
    private String thirdSoftwareName;

    /**
     * 第三方用户Id
     */
    private long thirdUserId;

    /**
     * 第三方用户名
     */
    private String thirdUserName;

    /**
     * 第三方盐密
     */
    private String thirdToken;

    /**
     * 第三方首次注册时间
     */
    private Date triCreateTime;

    /**
     * 第三方失效时间
     */
    private Date triValidTime;

}
