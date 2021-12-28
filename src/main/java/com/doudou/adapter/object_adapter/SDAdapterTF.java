package com.doudou.adapter.object_adapter;

/**
 * <pre>
 * 说   明：适配器
 *          这里接口只有1个方法需要实现  如果有多个方法需要实现 且有些方法不想实现的话
 *          可以先定义一个抽象类 实现 SDCard接口中的部分方法 或 全部方法  适配器再继承抽象类实现特定方法
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class SDAdapterTF implements SDCard{

    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        return tfCard.readTF();
    }

}
