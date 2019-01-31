package com.cb.reflection.invacation;

import java.lang.reflect.Proxy;

/**
 * 通过Proxy创建代理对象
 * 代理对象持有invocation
 * invocation持有被代理的对象
 * invocation调用被代理对象真正的方法
 * @author ChenOT
 * @date 2019-01-30
 * @see
 * @since
 */
public class Test {
    public static void main(String[] args) {
        // 被代理的真实对象
        Person realObject = new Student();
        //这一句是生成代理类的class文件，前提是你需要在工程根目录下创建com/sun/proxy目录，不然会报找不到路径的io异常
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        // 创建代理
        MyInvocationHandler myInvacationHandler = new MyInvocationHandler(realObject);
//        MyInvocationHandler myInvacationHandler = new MyInvocationHandler();
        // 创建代理对象
//        StoryInterface storyInterface = (StoryInterface)Proxy.newProxyInstance(
//                StoryInterface.class.getClassLoader(),
//                new Class[]{StoryInterface.class},
//                myInvacationHandler);
        Person person = (Person)Proxy.newProxyInstance(
                Person.class.getClassLoader(),
                new Class[]{Person.class},
//                realObject.getClass().getInterfaces(),
                myInvacationHandler);
        String r = person.sayHello("你好啊");
        System.out.println(r);
        String r1 = person.sayGood("再见啦");
        System.out.println(r1);
        System.out.println("end");
    }
}
