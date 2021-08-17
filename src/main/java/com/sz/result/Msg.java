package com.sz.result;
/**
 * 信息返回包装
 * @author Lyh
 * @date 2021/08/09  8:51
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Msg {


    /**
     * code 200 操作成功
     * code 400 操作失败
     */
    private Integer code;
    private String message;
    private Map<Object,Object> data=new LinkedHashMap<>();

    public static Msg success(){
        Msg result=new Msg();
        result.setCode(200);
        result.setMessage("操作成功");
        return result;
    }
    public static Msg fail(){
        Msg result=new Msg();
        result.setCode(400);
        result.setMessage("操作失败");
        return result;
    }
    public Msg add(String key,Object value){
        this.getData().put(key,value);
        return this;
    }

}

