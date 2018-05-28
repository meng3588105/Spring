package com.mmm;

import com.mmm.Service.BuyStockService;
import com.mmm.proxyfactory.Impl.BuyStockException;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExceptionDemo {
    /**
     *在service层增加了运行工时异常  但是没有使用事务
     * 问题：
     *  01.用户的钱减少了
     *  02.出现异常
     *  03.股票数量还没有增加
     *
     *  配置完事务后  再次运行
     *  getBean  获取的是事务工厂
     */
    @Test
    public void testBuyAddRuntimeException()throws ArithmeticException{
        ApplicationContext context =new ClassPathXmlApplicationContext("proxyFactory.xml");
        BuyStockService stockService = (BuyStockService) context.getBean("proxyFactoryBean");
        stockService.buyStock("张三",100,1);

    }
    /**
     * aspectj实现事务
     */
    @Test
    public  void testAspectjException() throws com.mmm.aspectj.Impl.BuyStockException, BuyStockException {
        ApplicationContext context=new ClassPathXmlApplicationContext("aspectj.xml");
        com.mmm.aspectj.BuyStockService stockService= (com.mmm.aspectj.BuyStockService) context.getBean("buyStockService");
        stockService.buyStock("张三",100,1);
    }
    /**
     * 注解实现事务
     */
    @Test
    public  void testAnnotationException() throws com.mmm.annotation.Impl.BuyStockException {
        ApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
        com.mmm.annotation.BuyStockService service= (com.mmm.annotation.BuyStockService) context.getBean("buyStockService");
        service.buyStock("张三",100,1);
    }

}
