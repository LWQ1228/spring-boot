package com.sunao.chapter04.controller;

import org.springframework.web.bind.annotation.*;

/**
 * BookController
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/31 10:37
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping("/")
    public String addBook(String name) {
        return "receive:" + name;
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        return String.valueOf(id);
    }
}
