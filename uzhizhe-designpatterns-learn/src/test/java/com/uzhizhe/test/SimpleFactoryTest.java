package com.uzhizhe.test;

import com.uzhizhe.simplefactory.Animal;
import com.uzhizhe.simplefactory.AnimalFactory;
import com.uzhizhe.simplefactory.AnimalType;
import org.junit.Test;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:04 PM
 */
public class SimpleFactoryTest {


    @Test
    public void test() {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal cat = animalFactory.getAnimal(AnimalType.cat);
        cat.eat();
        cat.sleep();

        Animal dog = animalFactory.getAnimal(AnimalType.dog);
        dog.eat();
        dog.sleep();

        Animal monkey = animalFactory.getAnimal(AnimalType.monkey);
        monkey.eat();
        monkey.sleep();

//        Animal animal = animalFactory.getAnimal(null);
//        animal.eat();
//        animal.sleep();


    }
}
