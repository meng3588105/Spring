package com.mmm.Dao;

/**
 * 账户类接口
 */
public interface AccountDao {
    /**
     * 注册用户
     * @param aname
     * @param balance
     */
    void addAccount(String aname,double balance);

    /**
     * 谁花了多少钱
     */
    void updateAccount(String aname,double money);

}
