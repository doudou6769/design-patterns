package com.doudou.factory.factorymethod;

/**
 * <pre>
 * 说   明：蘑菇工厂
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class MushroomFactory {

    static Food create(){
        return new Mushroom();
    }

}
