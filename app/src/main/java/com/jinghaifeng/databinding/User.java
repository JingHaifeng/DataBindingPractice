package com.jinghaifeng.databinding;

/**
 * @author: haifeng jing(haifeng_jing@kingdee.com)
 * @date: 2016-04-01
 * @time: 11:46
 */
public class User {
    private String mName;
    private int mAge;

    public User(String name, int age) {
        mName = name;
        mAge = age;
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }
}

