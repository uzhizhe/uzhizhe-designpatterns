package com.uzhizhe.test;

import com.uzhizhe.factorymethod.DellFactory;
import com.uzhizhe.factorymethod.MacBookFactory;
import com.uzhizhe.factorymethod.ProductFactory;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:29 PM
 */
public class FactoryMethodTest {


    @Test
    public void test() throws Exception{
        ProductFactory dellFactory = new DellFactory();
        dellFactory.doSomething();

        ProductFactory macBookFactory = new MacBookFactory();
        macBookFactory.doSomething();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Date time = calendar.getTime();
        System.out.println(time);

        calendar.add(Calendar.DAY_OF_MONTH, -2);
        Date time1 = calendar.getTime();
        System.out.println(time1);

        calendar.add(Calendar.WEEK_OF_YEAR, 1);
        Date time2 = calendar.getTime();
        System.out.println(time2);


    }
}
