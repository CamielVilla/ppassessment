package com.example.pharmapartnersassessment.Controller;
import com.example.pharmapartnersassessment.model.dto.CreateCryptoValuta;
import com.example.pharmapartnersassessment.model.dto.CryptoValutaDto;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;
import com.example.pharmapartnersassessment.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("currencies/{id}")
    public ResponseEntity<CryptoValutaDto> getRecordById (@PathVariable String id){
        return ResponseEntity.ok(currencyService.getRecordById(id));
    }



}
