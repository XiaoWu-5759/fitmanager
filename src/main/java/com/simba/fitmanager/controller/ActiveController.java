package com.simba.fitmanager.controller;

import com.simba.fitmanager.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/active")
public class ActiveController {
    @Autowired
    private ActiveService activeService;

    @PostMapping("/{num1}")
    public String activeByOne(@PathVariable(value = "num1") String num) {
        System.out.println(num);
        String result = activeService.activeByOne(num);
        // 接口数据   url:localhost:8080/active/{num1},返回string
        //返回0，激活失败
        //返回1，是正常配件，激活成功
        //返回2，是备件，需要另外一个被激活的配件码
        //返回3，是激活过的配件，提示该配件已被激活
        return result;
    }

    @PostMapping("/{num1}/{num2}")
    public  String activeByTwo(@PathVariable(value = "num1") String num1,@PathVariable(value = "num2") String num2){
        System.out.println(num1+"+"+num2);
        String result = activeService.activeByTwo(num1,num2);

        //### url: localhost:8080/active/{num1}/{num2}
        //接口返回类型 string
        //返回0，激活码不正确，激活失败
        //返回1，激活成功
        //返回2，请将激活码填入正确的输入框中
        //第一个输入框填备件，第二个输入框填已激活件
        return result;
    }

}
