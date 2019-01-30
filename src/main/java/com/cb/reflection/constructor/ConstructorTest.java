package com.cb.reflection.constructor;

import com.cb.reflection.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
public class ConstructorTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class person = Person.class;
        // 获取构造方法集
        Constructor[] constructors = person.getConstructors();
        // 根据参数类型，获取指定构造方法
        Constructor constructor1 = person.getConstructor(String.class);
        // 获取构造方法参数
        for(Constructor constructor:constructors){
            System.out.println(constructor.getParameters());
        }
        // 利用constructor实例化对象
        Person person1 = (Person) constructor1.newInstance("123");
    }
}
