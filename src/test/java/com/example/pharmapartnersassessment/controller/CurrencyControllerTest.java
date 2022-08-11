package com.example.pharmapartnersassessment.controller;

import com.example.pharmapartnersassessment.service.CurrencyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc
class CurrencyControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    void shouldGetBitcoinRecord() throws Exception {
                mockMvc
                .perform(MockMvcRequestBuilders.get("/api/currencies/BTC"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("Bitcoin")));
    }

    @Test
    void shouldGetRippleRecord() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get("/api/currencies/XRP"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(containsString("Ripple")));
    }

    @Test
    void ShouldDeleteBitcoinRecord() throws Exception{
        mockMvc
                .perform(MockMvcRequestBuilders.delete("/api/currencies/BTC"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Record deleted"));
    }

}