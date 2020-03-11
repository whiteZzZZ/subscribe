package com.hzz.subscribe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "testTomcat",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,String> testTomcat(){
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("data","helloworld");
        return stringStringMap;
    }
}
