package com.example.pharmapartnersassessment.Controller;
import com.example.pharmapartnersassessment.model.dto.CreateCryptoValuta;
import com.example.pharmapartnersassessment.model.dto.CryptoValutaDto;
import com.example.pharmapartnersassessment.model.dto.UpdateCryptoValuta;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;
import com.example.pharmapartnersassessment.service.CurrencyService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("currencies")
    public ResponseEntity<List<CryptoValutaDto>> getAllRecords(){
        return ResponseEntity.ok(currencyService.getAllRecords());
    }

    @PutMapping("currencies/{id}")
    public ResponseEntity<CryptoValutaDto> updateRecordById (@Valid @RequestBody UpdateCryptoValuta update, @PathVariable String id){
    return ResponseEntity.ok(currencyService.updateRecord(id, update));
    }

    @DeleteMapping("currencies/{id}")
    public ResponseEntity<String> deleteRecordById (@PathVariable String id){
        currencyService.deleteRecordById(id);
        return ResponseEntity.ok("Record deleted");
    }

}
