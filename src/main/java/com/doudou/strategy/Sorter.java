package com.doudou.strategy;

/**
 * <pre>
 * 说   明：排序类
 * 创   建：窦慧文
 * 日   期：2021/12/12
 * Q    Q：1443502059
 * </pre>
 */
public class Sorter {

    // 排序
    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                // 实现整个排序过程中 算法行为是固定的
                // 唯一需要使用者提供的是判断2个对象谁大谁小的方式
                // 策略模式中将判断对象大小的方式抽象为接口 使用者需实现该接口以给出比较方式
                // 而排序算法的实现过程无需使用者关注
                minPos = arr[j].compareTo(arr[minPos]) < 0 ? j : minPos;
            }
            swap(arr,i,minPos);
        }
    }

    // 交换
    static void swap(Comparable<Object>[] arr, int i, int j){
        Comparable<Object> temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
