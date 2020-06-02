package com.insandiden.manage.crm.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lixh
 * @date 2020-06-01 16:08
 */
@Data
public class AdminParam implements Serializable {

    private static final long serialVersionUID = 230415594078850272L;
    private long id;
    private String username;
    private String password;

}
