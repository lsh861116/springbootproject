package com.insandiden.manage.crm.controllers;

import com.insandiden.manage.crm.core.CommonResult;
import com.insandiden.manage.crm.dto.LoginParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lixh
 * @date 2020-06-01 11:27
 */
@RestController
@RequestMapping(value = "/admin")
public class LoginController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody LoginParam loginParam){
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", "111111");
        tokenMap.put("tokenHead", "123311");
        return CommonResult.success(tokenMap);
    }
}
