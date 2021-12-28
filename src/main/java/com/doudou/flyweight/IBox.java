package com.doudou.flyweight;

/**
 * <pre>
 * 说   明：I图形（具体享元角色）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class IBox extends AbstractBox {
    @Override
    public String getShape() {
        return "I";
    }
}
