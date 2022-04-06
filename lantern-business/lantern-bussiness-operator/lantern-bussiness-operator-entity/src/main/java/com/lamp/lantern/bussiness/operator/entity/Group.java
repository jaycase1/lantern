package com.lamp.lantern.bussiness.operator.entity;

import com.lamp.lantern.bussiness.domain.RoleType;
import com.lamp.lantern.bussiness.domain.GroupType;
import com.lamp.lantern.bussiness.domain.Status;

import java.util.Date;

public class Group {

    /**
     * 用户组Id
     */
    private Long groupId;

    /**
     * 用户组名
     */
    private RoleType groupName;

    /**
     * 用户组上级Id
     */
    private Long groupSuperiorId;

    /**
     * 用户组上级名
     */
    private Long groupSuperiorName;

    /**
     * 系统Id
     */
    private Long systemId;

    /**
     * 系统名
     */
    private String systemName;

    /**
     * 用户人数上限
     */
    private int groupLimitNum;

    /**
     * 用户组当前人数
     */
    private int groupNum;

    /**
     * 用户组类别
     */
    private GroupType groupType;

    /**
     * 评论
     */
    private String remarks;

    /**
     * 用户组创建时间
     */
    private Date createTime;

    /**
     * 用户组修改时间
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
     * 用户组状态
     */
    private Status groupStatus;

}
