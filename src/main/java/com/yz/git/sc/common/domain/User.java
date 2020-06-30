package com.yz.git.sc.common.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description: List测试类
 * @title: User
 * @projectName： sc-eureka
 * @author： xuyang
 * @date： 2019/12/3/16:19
 * @version： 1.0
 */
@Getter
@Setter
@ToString
public class User {
    //feature021
    String username;
    Integer age;
    Integer gender;
    String idNo;
    String phone;
}
