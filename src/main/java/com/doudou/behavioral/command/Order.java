package com.doudou.behavioral.command;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * 说   明：订单
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class Order {

    // 餐桌号码
    private int diningTable;

    // 餐名和份数
    private Map<String,Integer> foodDic = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name,Integer num) {
        // 记录订单的餐名和份数
        this.foodDic.put(name,num);
    }



}
