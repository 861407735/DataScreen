package com.sz.controller;

import com.sz.common.Dist;
import com.sz.result.Msg;
import com.sz.result.Result;
import com.sz.service.DistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lyh
 * @date 2021/08/09  15:38
 */
@RestController
@RequestMapping("dist")
public class DistController {
    @Autowired
    private DistService distService;

    private final double NUMBER=100000000;  //固定数值 换算单位为亿
    /**
     * 获取数据资源公安数据
     * @param id
     * @param en
     * @param zh
     * @param typeen 城市拼音
     * @param typezh  城市名
     * @return
     */
    @GetMapping("getDataResourcesPublicSecurityData")
    public Msg getDataResourcesPublicSecurityData(@RequestParam(required = false,defaultValue = "1") Integer id,
                                                     @RequestParam(required = false,defaultValue = "data_resource_publicsecurity")String en,
                                                     @RequestParam(required = false,defaultValue = "数据资源公安数据")String zh,
                                                     @RequestParam(required = false)String typeen,
                                                     @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);

        if (null == result || result.size()==0) {
            return Msg.fail();
        }else {
//            for (Dist dist : result) {
//                 double num=dist.getResultValue()/NUMBER;
//                dist.setResultValue(Double.valueOf(String.format("%.3f", num)));
//            }
            return Msg.success().add("list",result);
        }
    }

    /**
     * 获取公安数据总数量
     * @return
     */
    @GetMapping("getPoliceDataVolume")
    public Msg getPoliceDataVolume(@RequestParam(required = false,defaultValue = "1")Integer id){
        double result = distService.getPoliceDataVolume(id);
//        double  num=result/NUMBER;
//        return Msg.success().add("result_value", String.format("%.3f", num));

        return Msg.success().add("result_value",result);
    }

    /**
     * 获取政务数据总数量
     * @return
     */
    @GetMapping("getGovernmentAffairsDataVolume")
    public Msg getGovernmentAffairsDataVolume(@RequestParam(required = false,defaultValue = "2")Integer id){
        double result = distService.getPoliceDataVolume(id);
        return Msg.success().add("result_value",result);
    }

    /**
     * 获取政法数据总数量
     * @return
     */
    @GetMapping("getPoliticsAndLawDataVolume")
    public Msg getPoliticsAndLawDataVolume(@RequestParam(required = false,defaultValue = "3")Integer id){
        double result = distService.getPoliceDataVolume(id);
        return Msg.success().add("result_value",result);
    }


    /**
     * 获取长三角数据总数量
     * @return
     */
    @GetMapping("getChangSanJiaoDataVolume")
    public Msg getChangSanJiaoDataVolume(@RequestParam(required = false,defaultValue = "4")Integer id){
        double result = distService.getPoliceDataVolume(id);
        return Msg.success().add("result_value",result);
    }

    /**
     * 获取互联网数据总数量
     * @return
     */
    @GetMapping("getInternetDataVolume")
    public Msg getInternetDataVolume(@RequestParam(required = false,defaultValue = "5")Integer id){
        double result = distService.getPoliceDataVolume(id);
        return Msg.success().add("result_value",result);
    }

    /**
     * 获取政务数据
     * @param id
     * @param en
     * @param zh
     * @param typeen
     * @param typezh
     * @return
     */
    @GetMapping("getDataResourcesGovernmentAffairsData")
    public Msg getDataResourcesGovernmentAffairsData(@RequestParam(required = false,defaultValue = "2") Integer id,
                                                  @RequestParam(required = false,defaultValue = "data_resource_governmentaffairs")String en,
                                                  @RequestParam(required = false,defaultValue = "数据资源政务数据")String zh,
                                                  @RequestParam(required = false)String typeen,
                                                  @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);

        if (null == result || result.size()==0) {
//            Msg msg = new Msg();
//            for (Dist dist : result) {
//                msg.add(dist.getDistTypeEn(),dist.getResultValue());
//
//            }
//            msg.setCode(200);
//            msg.setMessage("操作成功");
            return Msg.fail();
        }else {
            return Msg.success().add("list",result);
        }
    }

    /**
     * 获取政法数据
     * @param id
     * @param en
     * @param zh
     * @param typeen
     * @param typezh
     * @return
     */
    @GetMapping("getDataResourcesPoliticsAndLawData")
    public Msg getDataResourcesPoliticsAndLawData(@RequestParam(required = false,defaultValue = "3") Integer id,
                                                     @RequestParam(required = false,defaultValue = "data_resource_politicsandlaw")String en,
                                                     @RequestParam(required = false,defaultValue = "数据资源政法数据")String zh,
                                                     @RequestParam(required = false)String typeen,
                                                     @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);

        if (null == result || result.size()==0) {
//            Msg msg = new Msg();
//            for (Dist dist : result) {
//                msg.add(dist.getDistTypeEn(),dist.getResultValue());
//
//            }
//            msg.setCode(200);
//            msg.setMessage("操作成功");
            return Msg.fail();
        }else {
            return Msg.success().add("list",result);
        }
    }

    /**
     * 获取长三角数据
     * @param id
     * @param en
     * @param zh
     * @param typeen
     * @param typezh
     * @return
     */
    @GetMapping("getDataResourcesChangSanJiaoData")
    public Msg getDataResourcesChangSanJiaoData(@RequestParam(required = false,defaultValue = "4") Integer id,
                                                     @RequestParam(required = false,defaultValue = "data_resource_changsanjiao")String en,
                                                     @RequestParam(required = false,defaultValue = "数据资源长三角数据")String zh,
                                                     @RequestParam(required = false)String typeen,
                                                     @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);

        if (null == result || result.size()==0) {
//            Msg msg = new Msg();
//            for (Dist dist : result) {
//                msg.add(dist.getDistTypeEn(),dist.getResultValue());
//
//            }
//            msg.setCode(200);
//            msg.setMessage("操作成功");
            return Msg.fail();
        }else {
            return Msg.success().add("list",result);
        }
    }

    /**
     * 获取互联网数据
     * @param id
     * @param en
     * @param zh
     * @param typeen
     * @param typezh
     * @return
     */
    @GetMapping("getDataResourcesInternetData")
    public Msg getDataResourcesInternetData(@RequestParam(required = false,defaultValue = "5") Integer id,
                                                @RequestParam(required = false,defaultValue = "data_resource_internet")String en,
                                                @RequestParam(required = false,defaultValue = "数据资源互联网数据")String zh,
                                                @RequestParam(required = false)String typeen,
                                                @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);

        if (null == result || result.size()==0) {
//            Msg msg = new Msg();
//            for (Dist dist : result) {
//                msg.add(dist.getDistTypeEn(),dist.getResultValue());
//
//            }
//            msg.setCode(200);
//            msg.setMessage("操作成功");
            return Msg.fail();
        }else {
            return Msg.success().add("list",result);
        }
    }

    /**
     * 获取云资源城市分布数量
     * @param id
     * @param en
     * @param zh
     * @param typeen 城市拼音
     * @param typezh  城市名
     * @return
     */
    @GetMapping("getDistributionOfBasicCloudResourcesByCity")
    public Msg getDistributionOfBasicCloudResourcesByCity(@RequestParam(required = false,defaultValue = "6") Integer id,
                                                            @RequestParam(required = false,defaultValue = "basic_cloudresource_city_dist")String en,
                                                            @RequestParam(required = false,defaultValue = "基础云资源城市分布")String zh,
                                                            @RequestParam(required = false)String typeen,
                                                            @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);
        if (null == result && result.size()==0) {
            return Msg.fail();
        }else {
            Msg msg = new Msg();
            for (Dist dist : result) {
                msg.add(dist.getDistTypeEn(),dist.getResultValue());
            }
            msg.setCode(200);
            msg.setMessage("操作成功");
            return msg;
        }
    }

    /**
     * 获取云资源城市分布总数量(暂时没用到)
     * @return
     */
    @GetMapping("getNumberOfCloudResourcesInCities")
    public Msg getNumberOfCloudResourcesInCities(){
        double result = distService.getPoliceDataVolume(2);
        return Msg.success().add("result_value",result);
    }

    /**
     * 获取云资源产品分布数量
     * @param id
     * @param en
     * @param zh
     * @param typeen
     * @param typezh
     * @return
     */
    @GetMapping("getDistributionOfCloudResourceProducts")
    public Msg getDistributionOfCloudResourceProducts(@RequestParam(required = false,defaultValue = "7") Integer id,
                                                          @RequestParam(required = false,defaultValue = "basic_cloudresource_product_dist")String en,
                                                          @RequestParam(required = false,defaultValue = "基础云资源产品分布")String zh,
                                                          @RequestParam(required = false)String typeen,
                                                          @RequestParam(required = false)String typezh){
        List<Dist> result = distService.getDataResourcesPublicSecurityData(id, en, zh,typeen,typezh);
        if (null == result && result.size()==0) {
            return Msg.fail();
        }else {
            Msg msg = new Msg();
            for (Dist dist : result) {
                msg.add(dist.getDistTypeEn(),dist.getResultValue());
            }
            msg.setCode(200);
            msg.setMessage("操作成功");
            return msg;
        }
    }
}
