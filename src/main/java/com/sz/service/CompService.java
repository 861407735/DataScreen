package com.sz.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sz.common.Detail;
import com.sz.common.Run;
import com.sz.mapper.DetailMapper;
import com.sz.mapper.RunMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lyh
 * @date 2021/08/09  18:18
 */
@Service
public class CompService {
    @Autowired
    private DetailMapper detailMapper;
    @Autowired
    private RunMapper runMapper;

    public List getComponentUsageDetails() {
     return   detailMapper.selectList(null);
    }

    public List getComponentSrviceOeration(){
        QueryWrapper<Run> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("comp_call").last("limit 6");
        return runMapper.selectList(wrapper);
    }
}
