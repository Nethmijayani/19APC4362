package com.example.web_19apc4362;


import jakarta.jws.WebService;

@WebService
public class StringManipulationServiceImpl implements StringManipulationService {

    @Override
    public String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        return text.length();
    }
}
