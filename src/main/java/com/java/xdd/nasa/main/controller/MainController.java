package com.java.xdd.nasa.main.controller;

import com.java.xdd.spring.ApiVersion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qw on 2018/1/9.
 */
@CrossOrigin
@RestController
@RequestMapping("{v}/main")
public class MainController {


    //方式一
    @RequestMapping("main")
    @ApiVersion(1)
    public String main() {
        return "main1";
    }

    @RequestMapping("main")
    @ApiVersion(2)
    public String main2() {
        return "main2";
    }

    @RequestMapping("main")
    @ApiVersion(3)
    public String main3() {
        return "main3";
    }

    @RequestMapping("main")
    @ApiVersion(4)
    public String main4() {
        return "main";
    }

    //方式二
    @RequestMapping(value = "test", headers = "api-version=1")
    public String test1() {
        return "test1";
    }
    @RequestMapping(value = "test", headers = "api-version=2")
    public String test2() {
        return "test2";
    }
    @RequestMapping(value = "test", headers = "api-version=3")
    public String test3() {
        return "test3";
    }

}
