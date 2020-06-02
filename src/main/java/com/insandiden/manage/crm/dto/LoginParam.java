package com.insandiden.manage.crm.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lixh
 * @date 2020-06-01 15:27
 */
@Data
public class LoginParam {
    @ApiModelProperty(value = "用户名",required = true)
    private String username;
    @ApiModelProperty(value = "密码",required = true)
    private String password;

}
