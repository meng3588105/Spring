package com.mmm.proxyfactory.Impl;

import com.mmm.Dao.AccountDao;
import com.mmm.Dao.StockDao;
import com.mmm.proxyfactory.BuyStockService;

/**
 * //业务逻辑层
 */
public class BuyStockServiceImpl extends BuyStockService {

    //用户
    private AccountDao accountDao;
    //股票
    private StockDao stockDao;

    /**
     * 谁花了多少钱  自己的股票账户增加
     *
     * @param name   谁
     * @param money  多少钱
     * @param amount 股票数量
     */
    public void buyStock(String name, double money, int amount) throws ArithmeticException {
        //用户捡钱
        accountDao.updateAccount(name,money);
        if (1==1){ //模拟异常
           throw new ArithmeticException("购买股票失败");
        }
        //用户股票增加
        stockDao.updateStock(name,amount);
    }



    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public StockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }
}
