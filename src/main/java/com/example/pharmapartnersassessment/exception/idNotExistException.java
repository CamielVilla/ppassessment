package com.example.pharmapartnersassessment.exception;

public class idNotExistException extends RuntimeException{

    public idNotExistException(String id){
        super(id + " not exists");
    }

}
