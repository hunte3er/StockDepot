/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author eiker
 */
public class Depot {
    private Wallet wallet;
    private List<BigDecimal> walletHistory;
    private List<WalletTransaction> walletTransactionHistory;
    private Portfolio portfolio;
    private List<Portfolio> portfolioHistory;
    private List<PortfolioTransaction> portfolioTransactionHistory;
    
    private List<Stock> stocks;
    
    private BigDecimal walletTransactionFee = BigDecimal.ZERO;
    private BigDecimal portfolioTransaactionFee = BigDecimal.ZERO;
       
    public Depot(){
        this.wallet = new Wallet();
        this.walletHistory = new ArrayList();
        this.portfolio = new Portfolio();
        this.walletTransactionHistory = new ArrayList();
        this.portfolioHistory = new ArrayList();
        this.portfolioTransactionHistory = new ArrayList();  
        this.stocks = new ArrayList();
    }

    //Stocks
    public List<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }    
    
    //Wallet
    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public List<BigDecimal> getWalletHistory() {
        return walletHistory;
    }

    public void setWalletHistory(List<BigDecimal> walletHistory) {
        this.walletHistory = walletHistory;
    }

    public List<WalletTransaction> getWalletTransactionHistory() {
        return this.walletTransactionHistory;
    }
    
    public void setWalletTransactionHistory(List<WalletTransaction> walletTransactionHistory){
        this.walletTransactionHistory = walletTransactionHistory;
    }
    
    //Portfolio
    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public List<Portfolio> getPortfolioHistory() {
        return portfolioHistory;
    }

    public void setPortfolioHistory(List<Portfolio> portfolioHistory) {
        this.portfolioHistory = portfolioHistory;
    }

    public List<PortfolioTransaction> getPortfolioTransactionHistory() {
        return portfolioTransactionHistory;
    }

    public void setPortfolioTransactionHistory(List<PortfolioTransaction> portfolioTransactionHistory) {
        this.portfolioTransactionHistory = portfolioTransactionHistory;
    }
    
    //Buy & Sell    
    public void buy(Stock stock, Integer quantity){   
        BigDecimal amount = stock.getValue().multiply(new BigDecimal(quantity));     
        
        this.walletHistory.add(this.wallet.getAccountBalance());
        this.walletTransactionHistory.add(new WalletTransaction(amount.negate(),this.walletTransactionFee.negate()));
        this.wallet.subtract(amount.add(this.walletTransactionFee));
        
        this.portfolioHistory.add(this.portfolio);
        this.portfolioTransactionHistory.add(new PortfolioTransaction(stock, quantity));
        this.portfolio.add(stock, quantity);
    }
    
    public void sell(Stock stock, int quantity){
        BigDecimal amount = stock.getValue().multiply(new BigDecimal(quantity));   
        
        this.walletHistory.add(this.wallet.getAccountBalance());
        this.walletTransactionHistory.add(new WalletTransaction(amount,this.walletTransactionFee.negate()));
        this.wallet.add(amount.subtract(this.walletTransactionFee));
        
        this.portfolioHistory.add(this.portfolio);
        this.portfolioTransactionHistory.add(new PortfolioTransaction(stock, -quantity));
        this.portfolio.remove(stock, quantity);   
    }
}
