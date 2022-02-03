/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author eiker
 */
public class Portfolio {
    private Map<Stock, Integer> stocks;
    
    public Portfolio(){
        this.stocks = new ConcurrentHashMap();
    }
    
    public BigDecimal add(Stock stock, Integer quantity){
        if(!this.stocks.containsKey(stock))
            this.stocks.put(stock, quantity);
        else
            this.stocks.put(stock, this.stocks.get(stock) + quantity);
        return new BigDecimal(50).multiply(new BigDecimal(quantity));
    }
    
    public BigDecimal remove(Stock stock, Integer quantity){
        if(!this.stocks.containsKey(stock))
            this.stocks.put(stock, -quantity);
        else
            this.stocks.put(stock, this.stocks.get(stock) - quantity);
        return new BigDecimal(50).multiply(new BigDecimal(quantity));
    }
    
    @Override
    public String toString(){
        String result = "";
        result = this.stocks.entrySet().stream().map(pair -> "Symbol: " + pair.getKey().getSymbol() + " Amount: " + pair.getValue() + "\r\n").reduce(result, String::concat);
        return result;
    }
    
//    private Map<Stock, Integer> stocks;
//    private List<PortfolioTransaction> history;
//    private BigDecimal transactionFee;
//    
//    public Portfolio(){
//        this.stocks = new ConcurrentHashMap();
//        this.history = new ArrayList();
//        this.transactionFee = new BigDecimal(0);
//    }
    
//    public BigDecimal buy(Stock stock, Integer quantity){
//        if(!this.stocks.containsKey(stock))
//            this.stocks.put(stock, quantity);
//        else
//            this.stocks.put(stock, this.stocks.get(stock) + quantity);
//        return new BigDecimal(50).multiply(new BigDecimal(quantity));
//    }
//    
//    public BigDecimal sell(Stock stock, Integer quantity){
//        if(!this.stocks.containsKey(stock))
//            this.stocks.put(stock, -quantity);
//        else
//            this.stocks.put(stock, this.stocks.get(stock) - quantity);
//        return new BigDecimal(50).multiply(new BigDecimal(quantity));
//    }
    
//    public MoneyTransaction buy(Stock stock, Integer quantity){
//        if(!this.stocks.containsKey(stock))
//            this.stocks.put(stock, quantity);
//        else
//            this.stocks.put(stock, this.stocks.get(stock) + quantity);
//        PortfolioTransaction transaction = new PortfolioTransaction(stock, quantity, this.transactionFee);
//        this.history.add(transaction);
//        return new MoneyTransaction(transaction.getTotal(), this.transactionFee, transaction.getTransactionID());
//    }
//    
//    public MoneyTransaction sell(Stock stock, Integer quantity){
//        if(!this.stocks.containsKey(stock))
//            this.stocks.put(stock, -quantity);
//        else
//            this.stocks.put(stock, this.stocks.get(stock) - quantity);
//        PortfolioTransaction transaction = new PortfolioTransaction(stock, quantity, this.transactionFee);
//        this.history.add(transaction);
//        return new MoneyTransaction(transaction.getTotal(), this.transactionFee, transaction.getTransactionID());
//    }
//    
//    public Map<Stock, Integer> getStocks(){
//        return this.stocks;
//    }
//    
//    public void setStocks(Map<Stock, Integer> stocks){
//        this.stocks = stocks;
//    }
}
