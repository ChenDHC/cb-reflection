package com.cb.reflection;

import lombok.Data;
import lombok.Getter;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
@Data
public class Person {
    public String sex = "男";
    private int age;
    private String name;

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
