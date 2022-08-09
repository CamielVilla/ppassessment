package com.example.pharmapartnersassessment.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CryptoValuta {
    @Id
    private String ticker;
    private String name;
    private int numberOfCoins;
    private int marketCap;

    public CryptoValuta() {
    }

    public CryptoValuta(String ticker, String name, int numberOfCoins, int marketCap) {
        this.ticker = ticker;
        this.name = name;
        this.numberOfCoins = numberOfCoins;
        this.marketCap = marketCap;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(int numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {
        this.marketCap = marketCap;
    }
}
