package com.sunao.chapter04.controller;

import com.sunao.chapter04.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/31 11:13
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user/getUserById")
    public String getUserById(Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("user/deleteUserById")
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }
}
