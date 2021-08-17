package com.sz.controller;

import com.sz.common.Dist;
import com.sz.common.Stat;
import com.sz.result.Msg;
import com.sz.result.Result;
import com.sz.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author lyh
 * @date 2021-08-10
 */
@RestController
@RequestMapping("/stat")
public class StatController {
    @Autowired
    private StatService statService;

    private final double NUMBER=100000000; //数据单位换算为亿

    /**
     * 获取数据运用总量
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getTotalDataUsage")
    public Msg getTotalDataUsage(@RequestParam(required = false,defaultValue = "1") Integer id,
                                 @RequestParam(required = false,defaultValue = "data_apply_total")String en,
                                 @RequestParam(required = false,defaultValue = "数据运用总量")String zh){

        Stat stat = statService.getTotalDataUsage(id, en, zh);
        if (null != stat) {
            double result= stat.getResultValue()/NUMBER;

            return Msg.success().add("result_value",String.format("%.3f", result));
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取数据存储总量
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getTotalDataStores")
    public Msg getTotalDataStores(@RequestParam(required = false,defaultValue = "2") Integer id,
                                 @RequestParam(required = false,defaultValue = "data_store_total")String en,
                                 @RequestParam(required = false,defaultValue = "数据存储总量")String zh){

        Stat stat = statService.getTotalDataStores(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取基础设施应用
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getBasicsUse")
    public Msg getBasicsUse(@RequestParam(required = false,defaultValue = "3") Integer id,
                                  @RequestParam(required = false,defaultValue = "basics_use")String en,
                                  @RequestParam(required = false,defaultValue = "基础设施应用")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }

    /**
     * 获取基础设施实例
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getBasicsExample")
    public Msg getBasicsExample(@RequestParam(required = false,defaultValue = "4") Integer id,
                            @RequestParam(required = false,defaultValue = "basics_example")String en,
                            @RequestParam(required = false,defaultValue = "基础设施实例")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }
    /**
     * 获取基础设施计算使用率
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getBasicsUsage")
    public Msg getBasicsUsage(@RequestParam(required = false,defaultValue = "5") Integer id,
                                @RequestParam(required = false,defaultValue = "basics_usagerate")String en,
                                @RequestParam(required = false,defaultValue = "基础设施计算使用率")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }
    /**
     * 获取基础设施计算使用率
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getBasicsStorageUsage")
    public Msg getBasicsStorageUsage(@RequestParam(required = false,defaultValue = "6") Integer id,
                              @RequestParam(required = false,defaultValue = "basics_storageusage")String en,
                              @RequestParam(required = false,defaultValue = "基础设施计算存储使用率")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }

    /**
     * 获取应用支撑应用资源
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getApplicationSupportApplyResources")
    public Msg getApplicationSupportApplyResources(@RequestParam(required = false,defaultValue = "7") Integer id,
                                     @RequestParam(required = false,defaultValue = "application_support_apply")String en,
                                     @RequestParam(required = false,defaultValue = "应用支撑应用资源")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            double result= stat.getResultValue()/NUMBER;

            return Msg.success().add("result_value",String.format("%.3f", result));
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取应用支撑数据资源
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getApplicationSupportDataResources")
    public Msg getApplicationSupportDataResources(@RequestParam(required = false,defaultValue = "8") Integer id,
                                                   @RequestParam(required = false,defaultValue = "application_support_data")String en,
                                                   @RequestParam(required = false,defaultValue = "应用支撑数据资源")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            double result= stat.getResultValue()/NUMBER;

            return Msg.success().add("result_value", String.format("%.3f", result));
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取应用支撑累计成功
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getApplicationSupportSucceed")
    public Msg getApplicationSupportSucceed(@RequestParam(required = false,defaultValue = "9") Integer id,
                                                  @RequestParam(required = false,defaultValue = "application_support_succeed")String en,
                                                  @RequestParam(required = false,defaultValue = "应用支撑累计成功")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            double result= stat.getResultValue()/NUMBER;

            return Msg.success().add("result_value", String.format("%.3f", result));
        }else {
            return Msg.fail();
        }
    }
    /**
     * 获取应用支撑累计失败
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getApplicationSupportFail")
    public Msg getApplicationSupportFail(@RequestParam(required = false,defaultValue = "10") Integer id,
                                            @RequestParam(required = false,defaultValue = "application_support_fail")String en,
                                            @RequestParam(required = false,defaultValue = "应用支撑累计失败")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            double result= stat.getResultValue()/NUMBER;

            return Msg.success().add("result_value",String.format("%.3f", result));
        }else {
            return Msg.fail();
        }  }
    /**
     * 获取组件来源业务组件累计
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentSourceAccumulatedBusinessComponents")
    public Msg getComponentSourceAccumulatedBusinessComponents(@RequestParam(required = false,defaultValue = "11") Integer id,
                                            @RequestParam(required = false,defaultValue = "module_source_professionalwork")String en,
                                            @RequestParam(required = false,defaultValue = "组件来源业务组件累计")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }
    /**
     * 获取组件来源基础组件累计
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentSourceBaseComponentAccumulation")
    public Msg getComponentSourceBaseComponentAccumulation(@RequestParam(required = false,defaultValue = "12") Integer id,
                                            @RequestParam(required = false,defaultValue = "module_source_basic")String en,
                                            @RequestParam(required = false,defaultValue = "组件来源基础组件累计")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }
    /**
     * 获取组件来源业务组件新增
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentSourceAddedABusinessComponent")
    public Msg getComponentSourceAddedBusinessComponent(@RequestParam(required = false,defaultValue = "13") Integer id,
                                                           @RequestParam(required = false,defaultValue = "module_source_professionalwork_new")String en,
                                                           @RequestParam(required = false,defaultValue = "组件来源业务组件新增")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }
    /**
     * 获取组件来源基础组件新增
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentSourceBasicComponentAdded")
    public Msg getComponentSourceBasicComponentAdded(@RequestParam(required = false,defaultValue = "14") Integer id,
                                                         @RequestParam(required = false,defaultValue = "module_source_basic_new")String en,
                                                         @RequestParam(required = false,defaultValue = "组件来源基础组件新增")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }

    /**
     * 获取组件详情服务数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentDetailsServices")
    public Msg getComponentDetailsServices(@RequestParam(required = false,defaultValue = "15") Integer id,
                                                     @RequestParam(required = false,defaultValue = "module_use_servicenumber")String en,
                                                     @RequestParam(required = false,defaultValue = "组件详情服务数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }    }
    /**
     * 获取组件详情api接口数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentDetailsApiInterface")
    public Msg getComponentDetailsApiInterface(@RequestParam(required = false,defaultValue = "16") Integer id,
                                           @RequestParam(required = false,defaultValue = "module_use_api")String en,
                                           @RequestParam(required = false,defaultValue = "组件详情api接口数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }
    /**
     * 获取组件详情api接口数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentDetailsSupportFor")
    public Msg getComponentDetailsSupportFor(@RequestParam(required = false,defaultValue = "17") Integer id,
                                               @RequestParam(required = false,defaultValue = "module_use_support")String en,
                                               @RequestParam(required = false,defaultValue = "组件详情支撑数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }
    /**
     * 获取组件详情授权数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getComponentDetailsAuthorizationNumber")
    public Msg getComponentDetailsAuthorizationNumber(@RequestParam(required = false,defaultValue = "18") Integer id,
                                             @RequestParam(required = false,defaultValue = "module_use_impower")String en,
                                             @RequestParam(required = false,defaultValue = "组件详情授权数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }
    /**
     * 获取ECS资源CPU使用率
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getEcsResourceCpu")
    public Msg getEcsResourceCpu(@RequestParam(required = false,defaultValue = "19") Integer id,
                                                      @RequestParam(required = false,defaultValue = "ecs_resource_cpu")String en,
                                                      @RequestParam(required = false,defaultValue = "ECS资源CPU使用率")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            float num= stat.getResultValue();
            return Msg.success().add("result_value",num/100);
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取ECS资源内存占用率
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getResourceMemoryUsage")
    public Msg getResourceMemoryUsage(@RequestParam(required = false,defaultValue = "20") Integer id,
                                 @RequestParam(required = false,defaultValue = "ecs_resource_storage")String en,
                                 @RequestParam(required = false,defaultValue = "ECS资源内存占用率")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            float num= stat.getResultValue();
            return Msg.success().add("result_value",num/100);

        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取ECS资源cpu使用中
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getResourceCpuUse")
    public Msg getResourceCpuUse(@RequestParam(required = false,defaultValue = "21") Integer id,
                                      @RequestParam(required = false,defaultValue = "ecs_resource_cpu_inuse")String en,
                                      @RequestParam(required = false,defaultValue = "ECS资源cpu使用中")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取ECS资源cpu总核数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getResourceCpuCores")
    public Msg getResourceCpuCores(@RequestParam(required = false,defaultValue = "22") Integer id,
                                 @RequestParam(required = false,defaultValue = "ecs_resource_cpu_sum")String en,
                                 @RequestParam(required = false,defaultValue = "ECS资源cpu总核数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取ECS资源内存使用中
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getEcsResourceMemoryInUse")
    public Msg getEcsResourceMemoryInUse(@RequestParam(required = false,defaultValue = "23") Integer id,
                                   @RequestParam(required = false,defaultValue = "ecs_resource_storage_inuse")String en,
                                   @RequestParam(required = false,defaultValue = "ECS资源内存使用中")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取ECS资源内存总数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getEcsNumberOfMemoryCores")
    public Msg getEcsNumberOfMemoryCores(@RequestParam(required = false,defaultValue = "24") Integer id,
                                         @RequestParam(required = false,defaultValue = "ecs_resource_storage_sum")String en,
                                         @RequestParam(required = false,defaultValue = "ECS资源内存总数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取MaxCompute工作流数量  改为总计算资源数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getMaxComputeComputingResources")
    public Msg getMaxComputeComputingResources(@RequestParam(required = false,defaultValue = "25") Integer id,
                                         @RequestParam(required = false,defaultValue = "maxcompute_computing_resources")String en,
                                         @RequestParam(required = false,defaultValue = "MaxCompute总计算资源数")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }
    /**
     * 获取MaxCompute总运行次数  改为总存储容量
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getMaxComputeStorageCapacity")
    public Msg getMaxComputeStorageCapacity(@RequestParam(required = false,defaultValue = "26") Integer id,
                                       @RequestParam(required = false,defaultValue = "maxcompute_storage_capacity")String en,
                                       @RequestParam(required = false,defaultValue = "MaxCompute总存储容量")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
    }

    /**
     * 获取MaxCompute资源  改为 计算资源平均使用率
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getMaxComputeAverageUsageOfComputingResources")
    public Msg getMaxComputeAverageUsageOfComputingResources(@RequestParam(required = false,defaultValue = "27") Integer id,
                                   @RequestParam(required = false,defaultValue = "maxcompute_average_usage_of_computing_resources")String en,
                                   @RequestParam(required = false,defaultValue = "MaxCompute计算资源平均使用率")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
            long result= stat.getResultValue();

            return Msg.success().add("result_value",result);
        }else {
            return Msg.fail();
        }
    }
    /**
     * 获取数据授权数  需要传入参数 typeId ：31公安授权数  32政务授权数  33政法授权数  34长三角授权数  35互联网授权数
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getDataAuthorizationNumber")
    public Msg getDataAuthorizationNumber(@RequestParam(required = false,defaultValue = "28") Integer id,
                             @RequestParam(required = false,defaultValue = "data_authorization_times")String en,
                             @RequestParam(required = false,defaultValue = "授权次数")String zh,
                                          @RequestParam()Integer typeId){

        Stat stat = statService.getAuthorizationNumber(typeId);
        if (null != stat) {
            return Msg.success().add("result_value",stat.getResultValue());
        }else {
            return Msg.fail();
        }
//        if (result == null && result.size()==0) {
//            return Msg.fail();
//
//        }else {
//            long num=0;
//            for (Dist dist : result) {
//                num+=dist.getAuthorizationNumber();
//            }
//            return Msg.success().add("result_value",num);
//        }
    }

    /**
     * 获取MaxCompute存储使用率
     * @param id id查询 or 英文名 or中文名
     * @param en
     * @param zh
     * @return
     */
    @GetMapping("getMaxComputeStorageUsage")
    public Msg getMaxComputeStorageUsage(@RequestParam(required = false,defaultValue = "29") Integer id,
                                          @RequestParam(required = false,defaultValue = "maxcompute_storage_usage")String en,
                                          @RequestParam(required = false,defaultValue = "MaxCompute存储使用率")String zh){

        Stat stat = statService.common(id, en, zh);
        if (null != stat) {
           long result=stat.getResultValue();
            return Msg.success().add("result_value",result);
        }else {
            return Msg.fail();
        }
    }
}
