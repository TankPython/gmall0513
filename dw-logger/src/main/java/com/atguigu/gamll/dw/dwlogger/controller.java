package com.atguigu.gamll.dw.dwlogger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class Demo1Controller {
    @ResponseBody
    @RequestMapping("testDemo")
    public String testDemo(){
        return "hello demo";
    }
}
