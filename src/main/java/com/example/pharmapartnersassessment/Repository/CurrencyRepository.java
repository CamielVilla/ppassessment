package com.example.pharmapartnersassessment.Repository;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CurrencyRepository extends JpaRepository<CryptoValuta, String> {

}
