package com.animo.controller.backviews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/12/27.
 */
@Controller
@RequestMapping("/back/user")
public class UserBankViews {

    @GetMapping("list")
    public String list() {
        return "user/list";
    }

}
