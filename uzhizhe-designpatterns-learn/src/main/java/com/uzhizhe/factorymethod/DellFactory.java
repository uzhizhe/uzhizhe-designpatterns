package com.uzhizhe.factorymethod;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:28 PM
 */
public class DellFactory extends ProductFactory {

    public Product createProduct() {
        return new Dell();
    }
}
