package com.lamp.lantern.bussiness.operator.provider.mapper;

import com.lamp.lantern.bussiness.operator.entity.Group;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface GroupMapper {
    /**
     * 增加组
     * @param group
     */
    @Insert("insert into group_info " +
            "(gr_name, gr_superior_id, gr_superior_name, system_id, system_name, limit_num, nowtime_num, " +
            "gr_type, remarks, create_time, update_time, create_ui_id, create_ui_name, update_ui_id, update_ui_name, gr_status )" +
            "values(#{groupName}, #{groupSuperiorId}, #{groupSuperiorName}, #{systemId}, #{systemName}, #{groupLimitNum}, #{groupNum}, " +
            "#{groupType}, #{remarks}, #{createTime}, #{updateTime}, #{createUserId}, #{createUserName}, #{updateUserId}, #{updateUserName}, #{groupStatus})")
    public void insertGroup(Group group);

    /**
     * 删除组
     * @param group
     */
    @Update("update group_info set gr_status = #{groupStatus} " +
            "where gr_id = #{groupId}")
    public void deleteGroup(Group group);

    /**
     * 修改组
     * @param group
     */
    @Update("update group_info set " +
            "gr_name = #{groupName}, gr_superior_id = #{groupSuperiorId}, system_id = #{systemId}, system_name = #{systemName}, limit_num = #{groupLimitNum}, nowtime_num = #{groupNum}, " +
            "gr_type = #{groupType}, remarks = #{remarks}, create_time = #{createTime}, update_time = #{updateTime}, create_ui_id = #{createUserId}, create_ui_name = #{createUserName}, " +
            "update_ui_id = #{updateUserId}, update_ui_name = #{updateUserName}, gr_status = #{groupStatus}")
    public void updateGroup(Group group);

    /**
     * 查询组
     * @param group
     */
    @Select("select * from group_info " +
            "where gr_id = #{groupId}")
    public void queryGroup(Group group);

}
