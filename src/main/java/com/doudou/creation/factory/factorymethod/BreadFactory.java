package com.doudou.creation.factory.factorymethod;

/**
 * <pre>
 * 说   明：面包工厂
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class BreadFactory {

    static Food create(){
        // 这里写生成面包前的前置代码 如权限校验、日志等  也可以写后置代码 如日志、对象处理等
        return new Bread();
    }

}
