package com.setfive.demo.apiheaderdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    private static final Logger LOG = LoggerFactory.getLogger(MainController.class);

    @RequestMapping(path = "/api/hello", produces = "application/json")
    public Map<String, String> sayHello(@RequestParam("name") String name) {
        Map<String, String> result = new HashMap<>();
        result.put("greeting", "Hello " + name);
        return result;
    }

}
