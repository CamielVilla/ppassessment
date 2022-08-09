package com.example.pharmapartnersassessment.Repository;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CurrencyRepository extends JpaRepository<CryptoValuta, String> {
}
