package com.example.pharmapartnersassessment.Controller;
import com.example.pharmapartnersassessment.model.dto.CreateCryptoValuta;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;
import com.example.pharmapartnersassessment.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PostMapping("currencies")
    public ResponseEntity<CryptoValuta> createRecord (@RequestBody CreateCryptoValuta createCryptoValuta){
        return ResponseEntity.ok(currencyService.createRecord(createCryptoValuta));
    }



}
