package com.sz.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Lyh
 * @date 2021/08/09  18:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("adm_mih_list_comp_run")
public class Run implements Serializable {
    @TableId("id")
    private Integer id;
    private String compName;
    private Integer compCall;
    private Integer compSuccess;

}
