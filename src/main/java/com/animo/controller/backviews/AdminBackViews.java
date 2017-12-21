package com.animo.controller.backviews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Animo on 2017-12-21.
 */
@Controller
@RequestMapping("/admin/back/")
public class AdminBackViews {


    @GetMapping("home")
    public String home(){
        return "admin/home";
    }

    @GetMapping("index")
    public String index(){
        return "admin/index";
    }

}