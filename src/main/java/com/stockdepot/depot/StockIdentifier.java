/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stockdepot.depot;

import java.net.URI;

/**
 *
 * @author eiker
 */
public class StockIdentifier {
    private String symbol;
    private String description;
    private String isin;
    private String cins;
    private String warscode;
    private String assetID;
    private String conid;
    private String[] exchanges;
    private String currency;
    private String contractType;
    private String country;
    private URI url;
    private String yhSymbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public String getWarscode() {
        return warscode;
    }

    public void setWarscode(String warscode) {
        this.warscode = warscode;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getConid() {
        return conid;
    }

    public void setConid(String conid) {
        this.conid = conid;
    }

    public String[] getExchanges() {
        return exchanges;
    }

    public void setExchanges(String[] exchanges) {
        this.exchanges = exchanges;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public String getYhSymbol() {
        return yhSymbol;
    }

    public void setYhSymbol(String yhSymbol) {
        this.yhSymbol = yhSymbol;
    }
    
    
}