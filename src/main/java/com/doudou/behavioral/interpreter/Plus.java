package com.doudou.behavioral.interpreter;

/**
 * <pre>
 * 说   明：加法（非终结表达式）
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Plus extends AbstractExpression{

    private AbstractExpression left;
    private AbstractExpression right;

    public Plus() {
    }

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public AbstractExpression getLeft() {
        return left;
    }

    public void setLeft(AbstractExpression left) {
        this.left = left;
    }

    public AbstractExpression getRight() {
        return right;
    }

    public void setRight(AbstractExpression right) {
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        // 非终结表达式会递归计算
        return left.interpreter(context) + right.interpreter(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

}
