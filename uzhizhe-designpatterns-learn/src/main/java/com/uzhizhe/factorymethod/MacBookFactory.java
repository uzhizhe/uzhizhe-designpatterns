package com.uzhizhe.factorymethod;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:28 PM
 */
public class MacBookFactory extends ProductFactory {

    public Product createProduct() {
        return new MacBook();
    }
}
