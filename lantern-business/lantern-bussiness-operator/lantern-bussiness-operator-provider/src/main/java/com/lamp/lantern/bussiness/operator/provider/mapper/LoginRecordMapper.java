package com.lamp.lantern.bussiness.operator.provider.mapper;
import com.lamp.lantern.bussiness.operator.entity.Group;
import com.lamp.lantern.bussiness.operator.entity.LoginRecord;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginRecordMapper {

    /**
     * 增加登录记录
     * @param loginRecord
     */
    @Insert("insert into login_record " +
            "(ui_id, ul_login_time, ul_exit_time, ul_login_address, ul_login_ip, ul_login_device, ul_login_device_model, " +
            "ul_login_way, ul_login_system, ul_login_terminal, ul_quit_way, tri_id ) " +
            "values( #{loginUserId}, #{loginTime}, #{exitTime}, #{loginAddress}, #{loginIp}, #{loginDevice}, " +
            "#{loginDeviceModel}, #{loginWay}, #{loginSystem}, #{loginTerminal}, #{quitWay}, #{triId}")
    public void insertLoginGroup(LoginRecord loginRecord);

    /**
     * 更改登录记录
     * @param loginRecord
     */
    @Update("update login_record ul_exit_time = #{ulExitTime}, ul_quit_way = #{ulQuitWay} " +
            "where ul_id = #{loginRecordId}")
    public void updateLoginRecord(LoginRecord loginRecord);

    /**
     * 查询登录记录
     * @param loginRecord
     */
    @Select("select * from login_record " +
            "where ul_id = #{loginRecordId}")
    public LoginRecord queryLoginRecord(LoginRecord loginRecord);

}
