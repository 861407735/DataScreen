package com.sz.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Lyh
 * @date 2021/08/09  9:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("adm_mih_stat")
public class Stat implements Serializable {
    @TableId("id")
    private Integer id;
    private Integer subId;
    private String subNameEn;
    private String subNameZh;
    private long resultValue;

}
