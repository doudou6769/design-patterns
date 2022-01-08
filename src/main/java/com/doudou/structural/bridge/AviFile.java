package com.doudou.structural.bridge;

/**
 * <pre>
 * 说   明：avi视频文件（具体的实现化角色）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi 视频文件 - " + fileName);
    }
}
