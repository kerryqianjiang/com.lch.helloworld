package com.lch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorld {
    @Autowired
    public config conf;

    @RequestMapping("/hello")
    public Map<String,Object> showHelloWorld(){
        Map<String,Object> map = new HashMap<>();
        //map.put("port:", conf.getPort());
        map.put("msg","HelloWorld");
        return map;
    }
}
