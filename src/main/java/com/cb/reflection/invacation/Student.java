package com.cb.reflection.invacation;

/**
 * @author ChenOT
 * @date 2019-01-30
 * @see
 * @since
 */
public class Student implements Person {
    @Override
    public String sayHello(String content) {
        System.out.println("我是学生"+content);
        return"学生你好";
    }

    @Override
    public String sayGood(String content) {
        System.out.println("我是学生"+content);
        return "学生再见";
    }
}
