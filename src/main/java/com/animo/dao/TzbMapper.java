package com.animo.dao;

import com.animo.common.Pager;
import com.animo.pojo.Tzb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TzbMapper extends BaseMapper{

    List<Object> listPagerByBaid(@Param("pager") Pager pager,@Param("baid") Integer baid);

    Long countByBaid(Integer baid);

    List<Tzb> listTzb(@Param("uid") Integer uid,@Param("baid") Integer baid);
}