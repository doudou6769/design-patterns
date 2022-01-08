package com.doudou.structural.bridge;

/**
 * <pre>
 * 说   明：操作系统（抽象化角色）
 * 创   建：窦慧文
 * 日   期：2021/12/28
 * Q    Q：1443502059
 * </pre>
 */
public abstract class OperationSystem {

    protected VideoFile videoFile;

    public OperationSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    abstract void play(String fileName);

}
