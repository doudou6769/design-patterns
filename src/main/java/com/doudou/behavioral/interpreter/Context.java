package com.doudou.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 说   明：上下文环境
 * 创   建：窦慧文
 * 日   期：2022/1/15
 * Q    Q：1443502059
 * </pre>
 */
public class Context {

    private Map<Variable, Integer> map = new HashMap<>();

    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }

}
