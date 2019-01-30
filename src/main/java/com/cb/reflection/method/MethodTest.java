package com.cb.reflection.method;

import com.cb.reflection.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
public class MethodTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class person = Person.class;
        Method[] methods = person.getMethods();
        // 根据方法名+方法参数类型，获取特定的方法
        Method method = person.getMethod("getName", null);

        // 获取方法的参数
        Parameter[] parameters = method.getParameters();
        method.getParameterTypes();
        method.getReturnType();

        // 调用一个方法
        Person person1 = new Person();
        person1.setName("老大");
        Object returnValue = method.invoke(person1);
        System.out.println(returnValue);

    }
}
