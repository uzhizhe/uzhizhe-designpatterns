package com.uzhizhe.test;

import com.uzhizhe.singleton.MySingleton;
import org.junit.Test;

/**
 * @author qingjiang.li
 * @since 2019-07-01 2:43 PM
 */
public class MySingletonTest {

    @Test
    public void test(){
        MySingleton singleton = MySingleton.getInstance();

        MySingleton singleton1 = MySingleton.getInstance();
        MySingleton singleton2 = MySingleton.getInstance();
        MySingleton singleton3 = MySingleton.getInstance();
        MySingleton singleton4 = MySingleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
        System.out.println(singleton4);


    }


}
