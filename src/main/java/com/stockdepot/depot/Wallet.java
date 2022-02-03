/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eiker
 */
public class Wallet {
    private BigDecimal balance;
    
    public Wallet(){
        this.balance = new BigDecimal(0);
    }
    
    public void add(BigDecimal amount){
        this.balance.add(amount);
    }
     
    public void subtract(BigDecimal amount){
        this.balance.subtract(amount);
    }
    
    public BigDecimal getAccountBalance(){
        return this.balance;
    }
    
    @Override
    public String toString(){
        return "Account Balance: " + this.balance;
    }
}
