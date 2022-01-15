package com.doudou.behavioral.interpreter;

/**
 * <pre>
 * 说   明：解释器模式
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");
        Variable e = new Variable("e");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);
        context.assign(e, 5);
        // 构建表达式
        AbstractExpression expression = new Minus(new Plus(new Plus(new Plus(a,b), c), d), e);
        // 解释结果
        System.out.println(expression + "= " + expression.interpreter(context));
    }

}
