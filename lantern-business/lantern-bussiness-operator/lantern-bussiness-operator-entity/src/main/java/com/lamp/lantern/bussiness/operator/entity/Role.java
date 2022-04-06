package com.lamp.lantern.bussiness.operator.entity;

import com.lamp.lantern.bussiness.domain.RoleType;
import com.lamp.lantern.bussiness.domain.Status;

import java.util.Date;

public class Role {

    /**
     * 角色Id
     */
    private Long urId ;

    /**
     * 角色上级Id
     */
    private Long urSuperiorId;

    /**
     * 角色系统Id
     */
    private Long systemId;

    /**
     * 角色系统名
     */
    private String systemName;

    /**
     * 角色服务Id
     */
    private Long serviceId;

    /**
     * 角色服务名
     */
    private String serviceName;

    /**
     * 角色类型
     */
    private RoleType roleType;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 角色创建时间
     */
    private Date createTime;

    /**
     * 角色修改时间
     */
    private Date updateTime;

    /**
     * 创建角色用户Id
     */
    private Long createUiId;

    /**
     * 创建角色用户名
     */
    private String createUiName;

    /**
     * 修改角色用户Id
     */
    private Long updateRoleId;

    /**
     * 修改角色用户名
     */
    private String updateRoleName;

    /**
     * 角色状态
     */
    private Status urStatus;

}
