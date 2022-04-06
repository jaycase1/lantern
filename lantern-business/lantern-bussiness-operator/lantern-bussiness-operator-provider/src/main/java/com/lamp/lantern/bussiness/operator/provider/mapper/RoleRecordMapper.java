package com.lamp.lantern.bussiness.operator.provider.mapper;

import com.lamp.lantern.bussiness.operator.entity.RoleRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RoleRecordMapper {

    /**
     * 新增角色记录
     * @param roleRecord
     */
    @Insert("insert into role_record " +
            "(ui_id, ur_id, system_id, system_name, service_id, service_name, remarks, " +
            "create_time, update_time, create_ui_id, create_ui_name, update_ui_id, update_ui_name, rr_status ) " +
            "values(userId, roleId, systemId, systemName, serviceId, serviceName, remarks, " +
            "createTime, updateTime, createUserId, createUserName, updateUserId, updateUserName, roleRecordStatus )")
    public void insertRoleRecord(RoleRecord roleRecord);

    /**
     * 修改角色记录
     * @param roleRecord
     */
    @Update("update role_record set ui_id = #{userId}, ur_id = #{ur_id}, system_id = #{systemId}, system_name = #{systemName}, service_id = #{serviceId}, service_name = #{serviceName}, " +
            "remarks = #{remarks}, create_time = #{createTime}, update_time = #{updateTime}, create_ui_id = #{createUserId}, create_ui_name = #{createUserName}, update_ui_id = #{updateUserId}, update_ui_name = #{updateUserName}, rr_status = #{roleRecordStatus})")
    public void updateRoleRecord(RoleRecord roleRecord);

    /**
     * 删除角色记录
     * @param roleRecord
     */
    @Update("update role_record set rr_status = #{roleRecordStatus} " +
            "where rr_id = #{roleRecordId}")
    public void deleteRoleRecord(RoleRecord roleRecord);

    /**
     * 查找角色记录
     * @param roleRecord
     */
    @Select("select * from role_record " +
            "where rr_id = #{roleRecordId}")
    public RoleRecord queryRoleRecord(RoleRecord roleRecord);

}
