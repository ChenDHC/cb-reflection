package com.cb.reflection.array;

import java.lang.reflect.Array;

/**
 * @author ChenOT
 * @date 2019-01-29
 * @see
 * @since
 */
public class ArrayTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射创建数组
        int[] ints = (int[])Array.newInstance(int.class, 3);
        Array.set(ints,0,1);
        Array.set(ints,1,2);
        Array.set(ints,2,3);

        System.out.println(Array.get(ints, 1));

        // 获取数组的Class对象
        Class c = Class.forName("[I");
        Class c1 = ints.getClass();
        Class c2 = Array.newInstance(int.class,0).getClass();
    }
}
