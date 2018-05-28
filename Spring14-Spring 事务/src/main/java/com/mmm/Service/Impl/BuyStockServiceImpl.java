package com.mmm.Service.Impl;

import com.mmm.Dao.AccountDao;
import com.mmm.Dao.StockDao;
import com.mmm.Service.BuyStockService;

/**
 * 业务逻辑层
 */
public class BuyStockServiceImpl extends BuyStockService {

    //用户
    private AccountDao acountDao;
    //用户股票增加
    private StockDao stockDao;


    public void buyStock(String name,double money,int amount){
        //用户减钱
        acountDao.updateAccount(name,money);
        //用户股票增加
        stockDao.updateStock(name,amount);

    }



    public AccountDao getAcountDao() {
        return acountDao;
    }

    public void setAcountDao(AccountDao acountDao) {
        this.acountDao = acountDao;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
