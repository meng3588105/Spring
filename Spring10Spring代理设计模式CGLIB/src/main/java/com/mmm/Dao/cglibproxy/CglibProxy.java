package com.mmm.Dao.cglibproxy;




import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 动态代理
 *
 * 必须掌握一个类和一个接口
 * 001.MethodInterceptor 接口
 *      Object inteercept(Object obj,Method,Object[] args,MethodProxy methodProxy)
 *      intercept:拦截  所有的拦截器中都有这个intercept()
 *      相当于jdk动态代理中InvocationHandler中的invoke()
 * 002.EnHancer类
 *      Object create();创建我们需要的代理类对象
 *      void setCallBack();代理类执行完毕后，回馈信息给委托
 *      setSupperclass();设置代理类和委托类公共的接口或者父类
 */
public class CglibProxy implements MethodInterceptor {
    /**
     * 在enhancer中有一个setCallBack(this)
     * 这样就实现了代理类和委托类的关联
     *
     */
    private Enhancer enhancer =new Enhancer();

    /**
     * 创建代理类对象
     */

    public Object createProxy(Class clazz){
        //设置公共的接口或者公共的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);//建立关联关系
        return enhancer.create();

    }

    /**
     * 类似于我们jdk中的invoke
     */

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("==洗洗手==");//系统级业务  开始事务
        Object result=methodProxy.invokeSuper(o,objects);//主业务
        System.out.println("===再洗洗手==");//系统级业务  日志处理 关闭事务
        return result;
    }


}
