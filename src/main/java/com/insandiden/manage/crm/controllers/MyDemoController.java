package com.insandiden.manage.crm.controllers;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.xml.ws.RequestWrapper;

/**
 * @author lixh
 * @date 2020-05-27 16:55
 */
@RestController
public class MyDemoController {

    @RequestMapping("/demo")
    public String demo(){
        return "my demo project";
    }
}
