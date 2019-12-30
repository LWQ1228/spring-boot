package com.sunao.chapter01.controller;

import com.sunao.chapter01.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * BookController
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/30 15:56
 */
@RestController
public class BookController {
    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book();
        b1.setId(1).setAuthor("罗贯中").setName("三国演义");
        Book b2 = new Book();
        b2.setId(2).setAuthor("曹雪芹").setName("红楼梦");
        books.add(b1);
        books.add(b2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
}
