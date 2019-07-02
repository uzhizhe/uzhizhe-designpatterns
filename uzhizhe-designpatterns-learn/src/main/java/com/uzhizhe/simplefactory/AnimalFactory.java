package com.uzhizhe.simplefactory;

/**
 * @author qingjiang.li
 * @since 2019-07-01 3:01 PM
 */
public class AnimalFactory {

    public Animal getAnimal(AnimalType animalType) {
        if (animalType == AnimalType.cat) {
            return new Cat();
        } else if (animalType == AnimalType.dog) {
            return new Dog();
        } else if (animalType == AnimalType.monkey) {
            return new Monkey();
        } else {
            throw new RuntimeException("参数错误");
        }
    }

}
