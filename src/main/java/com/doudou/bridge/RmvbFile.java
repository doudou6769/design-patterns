package com.doudou.bridge;

/**
 * <pre>
 * 说   明：Rmvb视频文件（具体实现化角色）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件 - " + fileName);
    }
}
