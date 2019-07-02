package com.uzhizhe.singleton;

/**
 * @author qingjiang.li
 * @since 2019-07-01 2:43 PM
 */
public class MySingleton {


    private volatile static MySingleton singleton = null;

    private MySingleton(){}

    public static MySingleton getInstance(){
        if (singleton == null) {
            synchronized (MySingleton.class) {
                if (singleton == null) {
                    singleton = new MySingleton();
                }
            }
        }
        return singleton;
    }

}
