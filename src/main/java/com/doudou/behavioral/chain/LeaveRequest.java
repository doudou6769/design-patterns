package com.doudou.behavioral.chain;

/**
 * <pre>
 * 说   明：请假条
 * 创   建：窦慧文
 * 日   期：2022/1/9
 * Q    Q：1443502059
 * </pre>
 */
public class LeaveRequest {

    private String name;        // 姓名
    private Integer num;        // 天数
    private String content;     // 内容

    public LeaveRequest(String name, Integer num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
