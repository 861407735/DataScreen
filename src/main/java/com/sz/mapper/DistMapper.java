package com.sz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sz.common.Dist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Lyh
 * @date 2021/08/09  15:35
 */
@Mapper
public interface DistMapper extends BaseMapper<Dist> {

    @Select("SELECT * FROM adm_mih_dist WHERE id in\n" +
            "\t\t(SELECT\n" +
            "\tSUBSTRING_INDEX( GROUP_CONCAT(t.id ORDER BY t.gmt_create DESC), ',', 1 ) id \n" +
            "FROM\n" +
            "\tadm_mih_dist t \n" +
            "WHERE\n" +
            "\tt.sub_id = #{id} \n" +
            "GROUP BY\n" +
            "\tt.dist_type_en)")
    List<Dist> getDataResourcesPublicSecurityData(Integer id);
}
