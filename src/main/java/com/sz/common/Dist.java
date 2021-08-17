package com.sz.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Lyh
 * @date 2021/08/09  15:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("adm_mih_dist")
public class Dist implements Serializable {
    @TableId("id")
    private Integer id;
    private Integer subId;
    private String subNameEn;
    private String subNameZh;
    private String distTypeEn;
    private String distTypeZh;
    private double resultValue;

}
