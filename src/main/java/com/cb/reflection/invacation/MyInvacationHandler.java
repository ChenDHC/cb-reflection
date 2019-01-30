package com.cb.reflection.invacation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ChenOT
 * @date 2019-01-30
 * @see
 * @since
 */
public class MyInvacationHandler implements InvocationHandler{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是动态代理，我要先做别的事情");
        Object o = method.invoke(proxy, args);
        System.out.println("我是动态代理，我已经完成了主题工作，又在做别的事情。");
        return o;
    }
}
