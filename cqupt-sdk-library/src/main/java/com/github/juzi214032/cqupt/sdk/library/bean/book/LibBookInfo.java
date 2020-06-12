package com.github.juzi214032.cqupt.sdk.library.bean.book;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 图书信息
 *
 * @author Juzi - https://juzibiji.top
 * @since 2020/2/16 14:09
 */
@Data
@Accessors(chain = true)
public class LibBookInfo implements Serializable {

    private static final long serialVersionUID = 4295236742908970017L;
    /**
     * 书籍唯一id
     * （多本相同的书此id）相同
     * 用于获取馆藏副本信息
     */
    private String marcNo;

    /**
     * 索书号
     */
    private String id;

    /**
     * 书名
     */
    private String title;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String press;

    /**
     * 出版日期
     */
    private String pressDate;

    /**
     * 共有基本
     */
    private String allCount;

    /**
     * 剩余可借本数
     */
    private String borrowCount;

    /**
     * 定价
     */
    private String price;

    /**
     * isbn
     */
    private String isbn;

    /**
     * 简介
     */
    private String brief;
}
