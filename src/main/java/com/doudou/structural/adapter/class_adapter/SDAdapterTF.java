package com.doudou.structural.adapter.class_adapter;

/**
 * <pre>
 * 说   明：适配器
 *          Computer只能读取SD卡 如果需要读取TF卡 则适配器需要满足一下2点：
 *              1. Computer可以识别（实现SDCard接口）
 *              2. 能够读取TF卡信息（继承TFCard实现类，此时就继承了TF卡的读取能力）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{

    @Override
    public String readSD() {
        // 适配器中SD卡的读取 直接调用父类（TFCardImpl）的读取TF卡信息方法
        return readTF();
    }

}
