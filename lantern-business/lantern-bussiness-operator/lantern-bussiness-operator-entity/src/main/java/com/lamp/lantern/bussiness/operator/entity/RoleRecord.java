package com.lamp.lantern.bussiness.operator.entity;

import com.lamp.lantern.bussiness.domain.RoleType;
import com.lamp.lantern.bussiness.domain.Status;

import java.util.Date;

public class RoleRecord {

    /**
     * 角色记录表Id
     */
    private Long roleRecordId;

    /**
     * 用户Id
     */
    private Long userId;

    /**
     * 角色Id
     */
    private Long roleId;

    /**
     * 系统Id
     */
    private Long systemId;

    /**
     * 服务Id
     */
    private Long serviceId;

    /**
     * 系统名
     */
    private String systemName;

    /**
     * 服务名
     */
    private String serviceName;

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
     * 角色记录状态
     */
    private Status roleRecordStatus;
}
