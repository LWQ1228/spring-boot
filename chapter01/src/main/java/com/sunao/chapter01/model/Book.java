package com.sunao.chapter01.model;

/**
 * Book
 *
 * @author liuwenqing
 * @blame 刘文清
 * @date 2019/12/30 15:55
 */
public class Book {
    /**
     * ID
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 作者
     */
    private String author;

    public Integer getId() {
        return id;
    }

    public Book setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }
}
