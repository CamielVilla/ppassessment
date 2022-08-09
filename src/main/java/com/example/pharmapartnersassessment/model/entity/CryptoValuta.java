package com.example.pharmapartnersassessment.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CryptoValuta {
    @Id
    private String ticker;
    private String name;
    private Long numberOfCoins;
    private Long marketCap;

    public CryptoValuta() {
    }

    public CryptoValuta(String ticker, String name, Long numberOfCoins, Long marketCap) {
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

    public Long getNumberOfCoins() {
        return numberOfCoins;
    }

    public void setNumberOfCoins(Long numberOfCoins) {
        this.numberOfCoins = numberOfCoins;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }
}
