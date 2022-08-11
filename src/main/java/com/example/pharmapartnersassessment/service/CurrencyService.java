package com.example.pharmapartnersassessment.service;

import com.example.pharmapartnersassessment.model.dto.CreateCryptoValuta;
import com.example.pharmapartnersassessment.model.dto.CryptoValutaDto;
import com.example.pharmapartnersassessment.model.dto.UpdateCryptoValuta;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;
import com.example.pharmapartnersassessment.repository.CurrencyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<CryptoValuta> getAllRecords (Integer page, Integer size, String sort){
        Pageable paging = PageRequest.of(page, size, Sort.by(sort));

        Page<CryptoValuta> pagedResult = currencyRepository.findAll(paging);

        if(pagedResult.hasContent()){
            return pagedResult.getContent();
        }else {
            return new ArrayList<CryptoValuta>();
        }

    }

    public CryptoValutaDto updateRecord (String id, UpdateCryptoValuta updateCryptoValuta){
        if (currencyRepository.existsById(id)){
            CryptoValuta cryptoValuta = currencyRepository.findById(id).get();
            cryptoValuta.setMarketCap(updateCryptoValuta.getMarketCap());
            cryptoValuta.setNumberOfCoins(updateCryptoValuta.getNumberOfCoins());
            currencyRepository.save(cryptoValuta);
            return toDto(cryptoValuta);
        }else{
            throw new RuntimeException();
        }
    }

    public void deleteRecordById (String id){
        if (currencyRepository.existsById(id)){
            currencyRepository.deleteById(id);
        }else {
            throw new RuntimeException();
        }
    }
}
