package com.mmm;

import com.mmm.Service.BuyStockService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BuyStock {


    /**
     * 没有使用事务的处理
     *
     *
     */
    @Test
    public void testBuyNoTx(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyStockService stockService = (BuyStockService) context.getBean("buyStockService");
        stockService.buyStock("张三",100,1);

    }

}
