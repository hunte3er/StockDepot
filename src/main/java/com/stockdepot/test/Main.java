/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.test;

import com.stockdepot.depot.Depot;
import com.stockdepot.depot.Stock;
import java.math.BigDecimal;

/**
 *
 * @author eiker
 */
public class Main {
    public static void main(String[] args){
        Depot depot = new Depot();
        Stock stockA = new Stock("AAA", new BigDecimal(3));
        Stock stockB = new Stock("BBB", new BigDecimal(2));
        
        depot.buy(stockA, 30);
        depot.sell(stockB, 2);
        
        System.out.println(depot.getWalletTransactionHistory());
        System.out.println("------------------------------");
        System.out.println(depot.getWalletHistory());
        System.out.println("------------------------------");
        System.out.println(depot.getWallet());
        System.out.println("------------------------------");
        System.out.println("------------------------------");
//        System.out.println(depot.getPortfolioTransactionHistory());
        System.out.println("------------------------------");
//        System.out.println(depot.getPortfolioHistory());
        System.out.println("------------------------------");
        System.out.println(depot.getPortfolio());
    }    
}
