package com.mmm.bean;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理  不能满足 继承父类的情况
 *
 * AnimalProxy  代理类
 */
public class AnimalProxy implements InvocationHandler {
    /**
     * 这里绝对不能使用Dog！
     * 因为我们压根不知道谁是委托类
     *
     */

    private Object object;


    /**
     * 给我们传递一个委托类，我们返回一个代理类
     */
    public Object crrateProxy(Object target){
        this.object=target;//传递dog  委托类就是dao  传递什么 委托类就是什么

        //第一个参数 类加载器，
        // 第二个参数代理类实现的所有接口，
        // 第三个参数  接口的实例（jdk动态代理  必须实现InvocationHandler 接口。这里让我们传一个接口，我们传自身！this）
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    /**
     * 代理类 给委托类 的工作的方法
     * 给主业务增强
     *
     * proxy：代理类的对象，一般不用
     * method：被代理的方法(需要执行的方法)
     * args：被代理的方法参数列表
     *
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==洗洗手==");
        //有返回值，使用变量接收
       Object result=method.invoke(object,args);
        System.out.println("==再次洗洗手==");
        return result;
    }
}
