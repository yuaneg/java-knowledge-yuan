package com.yuan.introspector;

/**
 * 测试bean
 * Created by 袁恩光 on 2017/4/3.
 */
public class Bean {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
