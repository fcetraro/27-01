package com.example.demo.controller;

import com.example.demo.model.MorseParser;
import com.example.demo.model.RomanParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParserController {
    @GetMapping("/parse/roman")
    public String numberToRoman(@RequestParam(value = "value") int decimal){
        RomanParser parser = new RomanParser();
        return parser.intToRoman(decimal);
    }
    @GetMapping("/parse/morse")
    public String morseToEnglish(@RequestParam(value = "value") String morse){
        MorseParser parser = new MorseParser();
        return parser.parseMorse(morse);
    }
}
