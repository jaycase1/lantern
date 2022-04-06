package com.lamp.lantern.bussiness.operator.service;

import com.lamp.lantern.bussiness.operator.entity.RoleRecord;
import com.lamp.lantern.bussiness.operator.entity.ThirdInfo;

import java.util.List;


public interface ThirdInfoService {

    /**
     * 添加第三方信息
     * @param thirdInfo
     */
    public Integer insertThirdInfo(ThirdInfo thirdInfo);

    /**
     * 更改第三方信息
     * @param thirdInfo
     */
    public Integer updateThirdInfo(ThirdInfo thirdInfo);

    /**
     * 删除第三方信息
     * @param thirdInfo
     */
    public Integer deleteThirdInfo(ThirdInfo thirdInfo);

    /**
     * 查询第三方信息
     * @param thirdInfo
     */
    public List<ThirdInfo> queryThirdInfo(ThirdInfo thirdInfo);
}
