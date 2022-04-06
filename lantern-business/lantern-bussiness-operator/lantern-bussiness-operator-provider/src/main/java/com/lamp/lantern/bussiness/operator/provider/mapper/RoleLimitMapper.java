package com.lamp.lantern.bussiness.operator.provider.mapper;
import com.lamp.lantern.bussiness.operator.entity.RoleLimit;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleLimitMapper {

    /**
     * 新增角色限制
     * @param roleLimit
     */
    @Insert("insert into role_limit " +
            "(ur_id, service_id, service_name, lim_type, remarks, create_time, update_time, " +
            "invalid_time, create_ui_id, create_ui_name, update_ui_id, update_ui_name, role_lim_status ) " +
            "values(#{roleId}, #{serviceId}, #{serviceName}, #{limitType}, #{remarks}, #{createTime}, #{updateTime}, " +
            "#{invalidTime}, #{createUserId}, #{createUserName}, #{updateUserId}, #{updateUserName}, #{roleLimitStatus}")
    public void insertRoleLimit(RoleLimit roleLimit);

    /**
     * 修改角色限制
     * @param roleLimit
     */
    @Update("update role_limit set ur_id = #{roleId}, service_id = #{serviceId}, service_name = #{serviceName}, lim_type = #{limitType} " +
            "remarks = #{remarks}, create_time = #{createTime}, update_time = #{updateTime}, invalid_time = #{invalidTime}, create_ui_id = #{createUserId} " +
            "create_ui_name = #{createUserName}, update_ui_id = #{updateUserId}, update_ui_name = #{updateUserName}, role_lim_status = #{roleLimitStatus}")
    public void updateRoleLimit(RoleLimit roleLimit);

    /**
     * 删除角色限制
     * @param roleLimit
     */
    @Update("update role_limit set role_lim_status = #{roleLimitStatus} " +
            "where role_lim_id = #{roleLimitId}")
    public void deleteRoleLimit(RoleLimit roleLimit);

    /**
     * 查询角色限制
     * @param roleLimit
     */
    @Select("select * from role_limit " +
            "where role_lim_id = #{roleLimitId}")
    public RoleLimit queryRoleLimit(RoleLimit roleLimit);

}
