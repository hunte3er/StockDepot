/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import java.math.BigDecimal;

/**
 *
 * @author eiker
 */
public class Stock {
    private final BigDecimal value;
    private final String symbol;

    public BigDecimal getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }
    
    public Stock(String symbol, BigDecimal value){
        this.symbol = symbol;
        this.value = value;
    }
}
