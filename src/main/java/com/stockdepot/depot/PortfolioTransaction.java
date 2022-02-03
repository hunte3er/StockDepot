/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author eiker
 */
public class PortfolioTransaction {
   
    private final Date transactionDate;
    private final Integer transactionVolume;
    private final Stock stock;
//    private final BigDecimal transactionFee;
    private final UUID transactionID;

    public UUID getTransactionID() {
        return transactionID;
    } 
    
    public PortfolioTransaction(Stock stock, int transactionVolume/*, BigDecimal transactionFee*/){
        this.transactionDate = Calendar.getInstance().getTime();
        this.transactionVolume = transactionVolume;
        this.stock = stock;
        //this.transactionFee = transactionFee;
        this.transactionID = UUID.randomUUID();
    }
        
    @Override
    public String toString(){
        return MessageFormat.format("ID: {0}\r\nName: {1}\r\nAmount: {2}\r\nValue: {3}\r\nTotal: {4}\r\nDate: {5}\r\n",
                this.transactionID,
                this.stock.getSymbol(),
                this.transactionVolume,
                this.stock.getValue(),
//                this.transactionFee,
                this.stock.getValue().multiply(new BigDecimal(this.transactionVolume)),
//                this.stock.getValue().multiply(new BigDecimal(this.transactionVolume)).add(this.transactionFee),
                this.transactionDate
                );
    }
    
    public BigDecimal getTotal(){
        return this.stock.getValue().multiply(new BigDecimal(this.transactionVolume));
    }
}
