package com.doudou.behavioral.interpreter;

/**
 * <pre>
 * 说   明：变量（终结表达式）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Variable extends AbstractExpression{

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int interpreter(Context context) {
        return context.getValue(this);
    }

}
