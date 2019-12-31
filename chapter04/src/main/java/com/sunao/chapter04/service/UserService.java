package com.sunao.chapter04.service;

import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/31 11:01
 */
@Service
public class UserService {
    public String getUserById(Integer id) {
        System.out.println("get...");
        return "user";
    }

    public void deleteUserById(Integer id) {
        System.out.println("delete...");
    }
}
