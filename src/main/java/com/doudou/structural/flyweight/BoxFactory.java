package com.doudou.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 说   明：工厂类 将该类设计为单例
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class BoxFactory {

    private static final BoxFactory INSTANCE = new BoxFactory();

    private Map<String,AbstractBox> map;

    // 构造方法初始化
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    public static BoxFactory getInstance(){
        return INSTANCE;
    }

    public AbstractBox getShape(String name){
        return map.get(name);
    }

}
