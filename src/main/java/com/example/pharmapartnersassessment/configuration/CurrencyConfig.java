//package com.example.pharmapartnersassessment.configuration;
//import com.example.pharmapartnersassessment.CurrencyRequestInterceptor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Component
//public class CurrencyConfig implements WebMvcConfigurer {
//
//    @Autowired
//    private CurrencyRequestInterceptor currencyRequestInterceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(currencyRequestInterceptor)
//                .addPathPatterns("/api/*");
//    }
//}
