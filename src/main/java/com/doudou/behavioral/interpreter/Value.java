package com.doudou.behavioral.interpreter;

/**
 * <pre>
 * 说   明：值（终结符表达式角色）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Value extends AbstractExpression{

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int interpreter(Context context) {
        // 终结表达式会停止（终结）递归计算
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}
