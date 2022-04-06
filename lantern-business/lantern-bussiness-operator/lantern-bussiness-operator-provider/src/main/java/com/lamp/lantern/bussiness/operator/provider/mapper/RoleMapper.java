package com.lamp.lantern.bussiness.operator.provider.mapper;
import com.lamp.lantern.bussiness.operator.entity.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper {

    /**
     * 添加角色
     * @param role
     */
    @Insert("insert into role_info " +
            "(ur_superior_id,  system_id, system_name, service_id, service_name, role_type, role_name,  remarks,  " +
            "create_time, update_time, create_ui_id,  create_ui_name, update_ui_id, update_ui_name, ur_status )" +
            "values(#{uiSuperiorId}, #{systemId},  #{systemName},  #{serviceId}, " +
            "#{serviceName}, #{roleType}, #{roleName}, #{remarks}, #{createTime} " +
            "#{updateTime}, #{createUiId}, #{createUiName}, #{updateUiId}, #{updateUiName}, #{urStatus})")
    public void insertRole(Role role);

    /**
     * 删除角色
     * @param role
     */
    @Update("update role_info set ur_status = #{urStatus}" +
            "where ur_id = #{urId}")
    public void deleteRole(Role role);

    /**
     * 更改角色
     * @param role
     */
    @Update("update role_info set " +
            "ur_superior_id = #{uiSuperiorId}, system_id = #{systemId}, system_name = #{systemName}, service_id = #{serviceId}, " +
            "service_name = #{serviceName}, role_type = #{roleType}, role_name = #{roleName}, remarks = #{remarks}, create_time = #{createTime} " +
            "update_time = #{updateTime}, create_ui_id = #{createUiId}, create_ui_name = #{createUiName}, update_ui_id = #{updateUiId}, update_ui_name = #{updateUiName} ")
    public void updateRole(Role role);

    /**
     * 查询角色
     * @param role
     */
    @Select("select * from role_info " +
            "where ur_id = #{urId}")
    public void queryRole(Role role);


}
