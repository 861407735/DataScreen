package com.sz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sz.common.Dist;
import com.sz.common.Stat;
import com.sz.mapper.DistMapper;
import com.sz.mapper.StatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author Lyh
 * @date 2021/08/09  9:17
 */
@Service
public class StatService {
    @Autowired
    private StatMapper statMapper;
    @Autowired
    private DistMapper distMapper;  //dist分类 mapper

    /**
     * 通用方法 所有的stat接口都可以调用
     * @param id
     * @param en
     * @param zh
     * @return
     */
    public Stat common(Integer id, String en, String zh){
        QueryWrapper<Stat> wrapper = new QueryWrapper<>();
        wrapper.eq("sub_id",id).or()
                .eq("sub_name_en",en).or()
                .eq("sub_name_zh",zh).orderByDesc("gmt_create").last("limit 1");
        return statMapper.selectOne(wrapper);
    }

    /**
     * 获取数据运用总量
     * @param id
     * @param en
     * @param zh
     * @return
     */
    public Stat getTotalDataUsage(Integer id, String en, String zh) {
        QueryWrapper<Stat> wrapper = new QueryWrapper<>();
        wrapper.eq("sub_id",id).or()
                .eq("sub_name_en",en).or()
                .eq("sub_name_zh",zh).orderByDesc("gmt_create").last("limit 1");;
        return statMapper.selectOne(wrapper);
    }
    /**
     * 获取数据存储总量
     * @param id
     * @param en
     * @param zh
     * @return
     */
    public Stat getTotalDataStores(Integer id, String en, String zh) {
        QueryWrapper<Stat> wrapper = new QueryWrapper<>();
        wrapper.eq("sub_id",id).or()
                .eq("sub_name_en",en).or()
                .eq("sub_name_zh",zh).orderByDesc("gmt_create").last("limit 1");
        return statMapper.selectOne(wrapper);
    }

    /**
     * 通过类型id 获取相应类型授权字数
     * @param typeId
     * @return
     */
    public Stat getAuthorizationNumber(Integer typeId){

        QueryWrapper<Stat> wrapper = new QueryWrapper<>();
        wrapper.eq("sub_id",typeId)
                .orderByDesc("gmt_create").last("limit 1");
        return  statMapper.selectOne(wrapper);
    }
}
