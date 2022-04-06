package com.lamp.lantern.bussiness.operator.entity;
import com.lamp.lantern.bussiness.domain.GenderType;
import com.lamp.lantern.bussiness.domain.RoleType;
import com.lamp.lantern.bussiness.domain.Status;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

class BaseEntity{

}

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@ApiModel(value="User",description="用户实体")
public class User extends BaseEntity {

    /**
     * 用户id
     */
    private Long uiId;

    /**
     * 用户名
     */
    private String uiName;

    /**
     * 用户昵称
     */
    private String uiNickname;

    /**
     * 用户图像
     */
    private long uiHeadPortrait;

    /**
     * 用户性别
     */
    private GenderType uiSex;

    /**
     * 用户年龄
     */
    private GenderType uiAge;

    /**
     * 用户生日
     */
    private Date uiBirth ;

    /**
     * 用户家庭地址
     */
    private String uiAddress ;

    /**
     * 用户联系方式
     */
    private String uiPhone ;

    /**
     * 用户邮箱
     */
    private String uiEmail ;

    /**
     * 用户密码
     */
    private String uiPassword ;

    /**
     * 用户盐
     */
    private String uiSalt;

    /**
     * 用户盐密
     */
    private String uiSaltPassword;

    /**
     * 用户令牌
     */
    private String uiToken ;

    /**
     * 用户登录地点
     */
    private String uiLoginAddress ;

    /**
     * 用户最近登录时间
     */
    private Date uiLoginTime ;

    /**
     * 用户最近退出时间
     */
    private String uiExitTime ;

    /**
     * 用户是否为第一次登录
     */
    private Boolean uiFirstLogin ;

    /**
     * 用户第三方信息Id
     */
    private long TriId ;

    /**
     * 用户状态
     */
    private Status uiStatus;


}
