package com.animo.service;

import com.animo.common.Pager;
import com.animo.common.ServerResponse;

/**
 * Created by Animo on 2018-01-02.
 */
public interface SkbService {

    ServerResponse<Pager> skblist(int pageNo, int pageSize, Integer uid,Integer baid);

}
