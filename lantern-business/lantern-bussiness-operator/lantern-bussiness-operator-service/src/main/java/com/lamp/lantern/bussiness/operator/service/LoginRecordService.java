package com.lamp.lantern.bussiness.operator.service;

import com.lamp.lantern.bussiness.operator.entity.LoginRecord;

import java.util.List;


public interface LoginRecordService {

    /**
     * 添加登录记录
     * @param loginRecord
     */
     public Integer insertLoginRecord(LoginRecord loginRecord);

    /**
     * 更改登录记录
     * @param loginRecord
     */
     public Integer updateLoginRecord(LoginRecord loginRecord);

    /**
     * 查询登录记录
     * @param loginRecord
     */
    public List<LoginRecord> queryLoginRecord(LoginRecord loginRecord);
}
