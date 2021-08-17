package com.sz.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sz.common.Dist;
import com.sz.mapper.DistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lyh
 * @date 2021/08/09  15:36
 */
@Service
public class DistService {
    @Autowired
    private DistMapper distMapper;

    /**
     * 若是用en 或是 zh查询  需要将controller层默认参数删除
     * 由前端传参
     * @param id
     * @param en
     * @param zh
     * @param typeen
     * @param typezh
     * @return
     */
    public List<Dist> getDataResourcesPublicSecurityData(Integer id, String en, String zh,String typeen,String typezh) {
//        QueryWrapper<Dist> wrapper = new QueryWrapper<>();
//        if ( null != typeen || null != typezh){
//            wrapper.eq("dist_type_en",typeen).or()
//                    .eq("dist_type_zh",typezh);
//            return distMapper.selectList(wrapper);
//        }else if ( null != id){
//            wrapper.eq("sub_id",id);
//            return distMapper.selectList(wrapper);
//        }else if ( null != en){
//            wrapper.eq("sub_name_en",en);
//            return distMapper.selectList(wrapper);
//        }else if ( null != zh) {
//            wrapper.eq("sub_name_zh",zh);
//            return distMapper.selectList(wrapper);
//        }else {
//            return null;
//        }
        if (null != id) {
            return distMapper.getDataResourcesPublicSecurityData(id);
        }else {
            return null;
        }

    }

    /**
     * 获取公安所有城市数据量
     * 可以运用所有dist表中的数据
     * 政务用的也是
     */
    public double getPoliceDataVolume(Integer id) {
        QueryWrapper<Dist> wrapper = new QueryWrapper<>();
        wrapper.eq("sub_id",id);
        List<Dist> dists = distMapper.getDataResourcesPublicSecurityData(id);
        double result = 0;
        for (Dist dist : dists) {
            result+=dist.getResultValue();
        }
        return result;
    }
}
