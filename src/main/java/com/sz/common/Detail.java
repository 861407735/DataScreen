package com.sz.common;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Lyh
 * @date 2021/08/09  18:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("adm_mih_list_comp_detail")
public class Detail implements Serializable {
    @TableId("id")
    private Integer id;
    private String compName;
    private String compCallSys;
    private String callComp;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date compCallTime;
    private String compState;
}
