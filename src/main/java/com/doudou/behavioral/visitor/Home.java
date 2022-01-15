package com.doudou.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 说   明：家（对象结构）
 *          里面包含猫和狗（具体元素） 并提供访问方法供访问者进行访问
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Home {

    List<Animal> animalList = new ArrayList<>();

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    // 具体访问元素的方法
    public void action(Person person){
        for (Animal animal : animalList) {
            animal.accept(person);
        }
    }

}
