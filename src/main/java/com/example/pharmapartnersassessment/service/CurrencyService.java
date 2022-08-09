package com.example.pharmapartnersassessment.service;

import com.example.pharmapartnersassessment.Repository.CurrencyRepository;
import com.example.pharmapartnersassessment.model.dto.CreateCryptoValuta;
import com.example.pharmapartnersassessment.model.dto.CryptoValutaDto;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }
    public CryptoValuta createRecord(CreateCryptoValuta createCryptoValuta) {
        CryptoValuta cryptoValuta = new CryptoValuta();
        cryptoValuta.setTicker(createCryptoValuta.getTicker());
        cryptoValuta.setName(createCryptoValuta.getName());
        cryptoValuta.setNumberOfCoins(createCryptoValuta.getNumberOfCoins());
        cryptoValuta.setMarketCap(createCryptoValuta.getMarketCap());
        return currencyRepository.save(cryptoValuta);
    }

    public CryptoValutaDto toDto (CryptoValuta cryptoValuta){
        CryptoValutaDto dto = new CryptoValutaDto();
        dto.setTicker(cryptoValuta.getTicker());
        dto.setName(cryptoValuta.getName());
        dto.setNumberOfCoins(cryptoValuta.getNumberOfCoins());
        dto.setMarketCap(cryptoValuta.getMarketCap());
        return dto;
    }

    public CryptoValutaDto getRecordById(String id) {
        if (currencyRepository.existsById(id)){
            CryptoValutaDto dto = toDto(currencyRepository.findById(id).get());
            return dto;
        }else {
            throw new RuntimeException();
        }
    }
}
