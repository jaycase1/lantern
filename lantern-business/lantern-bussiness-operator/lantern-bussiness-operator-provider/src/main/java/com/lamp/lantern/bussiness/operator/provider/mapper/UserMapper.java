package com.lamp.lantern.bussiness.operator.provider.mapper;
import com.lamp.lantern.bussiness.operator.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into user_info " +
            "(ui_name, ui_nickname, ui_head_portrait, ui_idcard, ui_sex, ui_birth, ui_address " +
            "ui_phone, ui_email, ui_password, ui_salt, ui_salt_password, ui_token, ui_login_address " +
            "ui_login_time, ui_exit_time, ui_first_login, tri_id, ui_status)" +
            "values(#{uiName}, #{uiNickname}, #{uiHeadPortrait}, #{uiIdcard}, #{uiSex}, #{uiBirth}, #{uiAddress}, " +
            "#{uiPhone}, #{uiEmail}, #{uiPassword}, #{uiSalt}, #{uiSaltPassword}, #{uiToken}, #{uiLoginAddress}, " +
            "#{uiLoginTime}, #{uiExitTime}, #{uiFirstLogin}, #{triId}, #{ui_status} )")
    public Integer insertUser(User user);

    /**
     * 查询用户
     * @param user
     */
    @Select("select * from user_info " +
            "where ui_id = #{uiId}")
    public List<User> queryUser(User user);

    /**
     * 修改用户
     * @param user
     */
    @Update("update user_info set ui_name = #{uiName}, ui_nickname = #{uiNickName}, ui_head_portrait = #{uiHeadPortrait}, " +
            "ui_idcard = #{uiIdcard}, ui_sex = #{uiSex}, ui_age = #{uiAge}, ui_birth = #{uiBirth}, ui_address = #{uiAddress}, + " +
            "ui_phone = #{uiPhone}, ui_email = #{uiEmail}, ui_password = #{uiPassword}, ui_salt = #{uiSalt}, ui_salt_password = #{uiSaltPassword}, " +
            "ui_token = #{uiToken}, ui_login_address = #{uiLoginAddress}, ui_exit_time = #{uiExitTime}, ui_first_login = #{uiFirstLogin} " +
            "where ui_id = #{uiId}")
    public Integer updateUser(User user);

    /**
     * 删除用户
     * @param user
     */
    @Update("update user_info set ui_status = #{uiStatus} " +
            "where ui_id = #{uiId}")
    public Integer deleteUser(User user);

}
