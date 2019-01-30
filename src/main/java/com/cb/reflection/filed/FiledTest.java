package com.cb.reflection.filed;

import com.cb.reflection.Person;

import java.lang.reflect.Field;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
public class FiledTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class person = Person.class;
        Field[] fields = person.getFields();
        Field field = person.getField("sex");

        // 获取变量名
        String name = field.getName();
        System.out.println(name);
        // 获取变量类型
        Object type = field.getType();
        System.out.println(type);
        //
        Person person1 = new Person();
        Object value = field.get(person1);
        System.out.println(value);
        //如果sex是public static类型，则
//        field.set(null, "女");
        field.set(person1, "女");
        System.out.println(person1);
    }
}
