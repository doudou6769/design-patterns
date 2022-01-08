package com.doudou.structural.bridge;

/**
 * <pre>
 * 说   明：Mac操作系统（扩展抽象化角色）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public class Mac extends OperationSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    void play(String fileName) {
        videoFile.decode(fileName);
    }

}
