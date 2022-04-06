package com.lamp.lantern.bussiness.operator.service;

import com.lamp.lantern.bussiness.operator.entity.Role;
import com.lamp.lantern.bussiness.operator.entity.RoleRecord;

import java.util.List;


public interface RoleRecordService {

    /**
     * 添加角色记录
     * @param roleRecord
     */
    public Integer insertRoleRecord(RoleRecord roleRecord);

    /**
     * 更改角色记录
     * @param roleRecord
     */
    public Integer updateRoleRecord(RoleRecord roleRecord);

    /**
     * 删除角色记录
     * @param roleRecord
     */
    public Integer deleteRoleRecord(RoleRecord roleRecord);

    /**
     * 查询角色记录
     * @param roleRecord
     */
    public List<RoleRecord> queryRoleRecord(RoleRecord roleRecord);

}
