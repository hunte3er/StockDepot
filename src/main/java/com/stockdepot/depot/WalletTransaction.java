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
public class WalletTransaction {
    private final Date transactionDate;
    private final BigDecimal transactionVolume;
    private final BigDecimal transactionFee;
    private final UUID transactionID;
    
    public WalletTransaction(BigDecimal transactionVolume, BigDecimal transactionFee){
        this.transactionDate = Calendar.getInstance().getTime();
        this.transactionVolume = transactionVolume;
        this.transactionFee = transactionFee;
        this.transactionID = UUID.randomUUID();
    }
    
    public WalletTransaction(BigDecimal transactionVolume, BigDecimal transactionFee, UUID transactionID){
        this.transactionDate = Calendar.getInstance().getTime();
        this.transactionVolume = transactionVolume;
        this.transactionFee = transactionFee;
        this.transactionID = transactionID;
    }
    
    @Override
    public String toString(){
        return      "ID: " + this.transactionID + "\t"
                +   "Amount: " + this.transactionVolume + "\t"
                +   "Fee: " + this.transactionFee + "\t"
                +   "Total: " + this.transactionVolume.add(this.transactionFee) + "\t"
                +   "Date: " + this.transactionDate + "\r\n";
    }
    
    public BigDecimal getTotal(){
        return this.transactionVolume.add(this.transactionFee);
    }
// 
//    private Date date;
//    private BigDecimal amount;
//    private BigDecimal fee;
//    private BigDecimal total;
//   
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
//
//    public BigDecimal getAmount() {
//        return amount;
//    }
//
//    public void setAmount(BigDecimal amount) {
//        this.amount = amount;
//    }
//
//    public BigDecimal getFee() {
//        return fee;
//    }
//
//    public void setFee(BigDecimal fee) {
//        this.fee = fee;
//    }
//
//    public BigDecimal getTotal() {
//        return total;
//    }
//
//    public void setTotal(BigDecimal total) {
//        this.total = total;
//    }
//        
//    public ClearingTransaction(Date date, BigDecimal amount, BigDecimal fee, BigDecimal total){
//        
//        this.date = date;
//        this.amount = amount;
//        this.fee = fee;
//        this.total = total;
//        
//    }
    
}
