package com.doudou.bridge;

/**
 * <pre>
 * 说   明：桥接模式
 *          将解码行为 和 操作系统的播放行为分离  且任何一方都很容易进行扩展
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Main {

    public static void main(String[] args) {
        // 创建Mac系统
        OperationSystem mac = new Mac(new AviFile());
        // 使用操作系统播放视频文件
        mac.play("战狼3");
    }

}
