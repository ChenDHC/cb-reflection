package com.cb.reflection.invacation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ChenOT
 * @date 2019-01-30
 * @see
 * @since
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object object;
    public MyInvocationHandler(Object object){
        this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("MyInvocationHandler invoke begin");
        System.out.println("proxy: "+ proxy.getClass().getName());
        System.out.println("method: "+ method.getName());
        if("sayHello".equals(method.getName())){
            System.out.println("在说你好之前，先微笑吧。");
        }
//        for(Object o : args){
//            System.out.println("arg: "+ o);
//        }
        //通过反射调用 被代理类的方法
        MonitorUtil.start();
        method.invoke(object, args);
        MonitorUtil.finish(method.getName());
//        method.invoke(proxy, args);
//        System.out.println("MyInvocationHandler invoke end");
        return null;
    }
}
