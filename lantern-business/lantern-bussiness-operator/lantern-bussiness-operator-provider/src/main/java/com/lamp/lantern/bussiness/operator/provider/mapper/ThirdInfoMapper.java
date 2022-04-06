package com.lamp.lantern.bussiness.operator.provider.mapper;
import com.lamp.lantern.bussiness.operator.entity.ThirdInfo;
import org.apache.ibatis.annotations.*;


@Mapper
public interface ThirdInfoMapper {
    /**
     * 添加用户第三方信息
     * @param thirdInfo
     */
    @Insert("insert into third_info " +
            "(ui_id, tri_type, tri_platform_id, tri_platform_name, tri_softward_id, tri_software_name, " +
            "tri_user_id, tri_user_name, tri_token, tri_create_time, tri_invalid_time) " +
            "values( #{userId}, #{thirdType}, #{thirdPlatformId},  #{thirdPlatformName}, #{thirdSoftwardId}, #{thirdSoftwareName}, " +
            "#{thirdUserId}, #{thirdUserName}, #{thirdToken}, #{triCreateTime}, #{triValidTime})")
    public void insertThirdInfo(@Param("thirdInfo") ThirdInfo thirdInfo);

    /**
     * 修改用户第三方信息
     * @param thirdInfo
     */
    @Update("update third_info set " +
            "ui_id = #{userId}, tri_type = #{thirdType}, tri_platform_id = #{thirdPlatformId}, tri_platform_name = #{thirdPlatformName}, tri_softward_id = #{thirdSoftwardId}, " +
            "tri_software_name = #{thirdSoftwareName}, tri_user_id = #{thirdUserId}, tri_user_name = #{thirdUserName}, tri_token = #{thirdToken}, tri_create_time = #{triCreateTime}, tri_invalid_time = #{triValidTime}")
    public void updateThirdInfo(ThirdInfo thirdInfo);

    /**
     * 删除用户第三方信息
     * @param thirdInfo
     */
    @Update("update third_info set tri_invalid_time = #{triInvalidTime} " +
            "where tri_id = #{thirdId}")
    public void deleteThirdInfo(ThirdInfo thirdInfo);

    /**
     * 查询用户第三方信息
     * @param thirdInfo
     */
    @Select("select * from third_info "+
           "where tri_id = #{thirdId)")
    public ThirdInfo queryThirdInfo(ThirdInfo thirdInfo);
}
