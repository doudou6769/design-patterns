package com.doudou.structural.adapter.object_adapter;

/**
 * <pre>
 * 说   明：电脑  使用者
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Computer {

    public String readSD(SDCard sdCard){
        if(sdCard == null){
            throw new RuntimeException("sd card is null");
        }
        return sdCard.readSD();
    }

}
