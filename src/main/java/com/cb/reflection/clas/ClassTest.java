package com.cb.reflection.clas;

import com.cb.reflection.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 获取class的两种方式
        Class person = Person.class;
        Class person1 = Class.forName("com.cb.reflection.Person");
        // 类名
        System.out.println(person.getName());
        // 修饰符
        System.out.println(Modifier.isPublic(person.getModifiers()));
        // 包信息
        System.out.println(person.getPackage());
        // 实现的接口
        System.out.println(person.getInterfaces());
        // 构造方法
        System.out.println("--------------构造方法----------------");
        Constructor[] constructors = person.getConstructors();
        System.out.println(constructors[0].getName());
        // 方法
        System.out.println("--------------方法----------------");
        Method[] methods = person.getMethods();
        for(Method method:methods){
            System.out.println(method.getName());
        }
        // 变量
        System.out.println("--------------变量----------------");
        Field[] fields = person.getFields();
        for(Field field:fields){
            System.out.println(field.getName());
        }
        // 注解
        System.out.println("--------------注解----------------");
        Annotation[] annotations = person.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println(annotation.annotationType());
        }
    }
}
