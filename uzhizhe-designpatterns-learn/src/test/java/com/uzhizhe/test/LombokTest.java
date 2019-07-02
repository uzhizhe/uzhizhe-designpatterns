package com.uzhizhe.test;

import com.uzhizhe.lombok.Book;
import org.junit.Test;

import java.util.Date;

/**
 * @author qingjiang.li
 * @since 2019-07-01 4:05 PM
 */
public class LombokTest {

    @Test
    public void test() {
        Book book = new Book();
        book.setId(100).setName("java jvm").setPrice("123.8").setCreateTime(new Date());
        System.out.println(book);

        Book nio2 = Book.builder().id(101).name("nio").price("88.5").createTime(new Date()).build();
        System.out.println(nio2);


    }



}
