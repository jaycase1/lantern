package com.lamp.lantern.bussiness.operator.entity;

import com.lamp.lantern.bussiness.domain.LimitType;
import com.lamp.lantern.bussiness.domain.RoleType;
import com.lamp.lantern.bussiness.domain.Status;

import java.util.Date;

public class RoleLimit {

    /**
     * 角色限制表Id
     */
    private Long roleLimitId;

    /**
     * 角色Id
     */
    private Long roleId;

    /**
     * 服务Id
     */
    private Long serviceId;

    /**
     * 服务名
     */
    private Long serviceName;

    /**
     * 限制类型
     */
    private LimitType limitType;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 失效时间
     */
    private Date invalidTime;

    /**
     * 创建用户Id
     */
    private Long createUserId;

    /**
     * 创建用户名
     */
    private String createUserName;

    /**
     * 修改用户Id
     */
    private Long updateUserId;

    /**
     * 修改用户名
     */
    private String updateUserName;

    /**
     * 状态
     */
    private Status roleLimitStatus;
}
