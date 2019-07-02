package com.uzhizhe.factorymethod;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:22 PM
 */
public abstract class ProductFactory {

    public abstract Product createProduct();


    public void doSomething() {
        Product product = createProduct();
        product.desc();
    }

}
