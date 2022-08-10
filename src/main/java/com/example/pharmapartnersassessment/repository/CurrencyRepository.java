package com.example.pharmapartnersassessment.repository;
import com.example.pharmapartnersassessment.model.entity.CryptoValuta;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<CryptoValuta, String> {

}
