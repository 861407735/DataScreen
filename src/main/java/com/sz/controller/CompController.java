package com.sz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sz.result.Msg;
import com.sz.service.CompService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Lyh
 * @date 2021/08/09  18:17
 */
@RestController
@RequestMapping("component")
public class CompController {

    @Autowired
    private CompService compService;

    /**
     * 查询正在使用的所有接口使用详情
     * @return
     */
    @GetMapping("getComponentUsageDetails")
    public Msg getComponentUsageDetails(){
        List result = compService.getComponentUsageDetails();
//        PageHelper.startPage(1,2);
//
//        PageInfo pageInfo = new PageInfo<>(result);
        if (null != result) {
            return Msg.success().add("list",result);
        }else {
            return Msg.fail();
        }
    }

    /**
     * 查询接口详情信息
     * @return
     */
    @GetMapping("getComponentSrviceOeration")
    public Msg getComponentSrviceOeration(){
        List result = compService.getComponentSrviceOeration();
        if (null != result) {
            return Msg.success().add("list",result);
        }else {
            return Msg.fail();
        }

    }

}
