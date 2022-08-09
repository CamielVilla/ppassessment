package com.example.pharmapartnersassessment.model.dto;


import javax.validation.constraints.NotNull;

public class UpdateCryptoValuta {

    @NotNull
    private Long numberOfCoins;
    @NotNull
    private Long marketCap;

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
