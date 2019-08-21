package com.leejungfoonpeter.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getRoot() {
        System.out.println("somebody got the root");
        // needs to match exactly the filename of a template in resources/templates
        return "hello";
    }

    @GetMapping("/capitalize/{variable}")
    public String getCapitalizedVariable(@PathVariable String variable, Model m) {
        String cVar = variable.toUpperCase();
        m.addAttribute("capVariable", cVar);
        return "capitalize";
    }
    
    @GetMapping("/reverse")
    public String reverse(@RequestParam(required=true) String sentence, Model m) {
        String reversedSentence = reverseString(sentence);
        m.addAttribute("reversedSentence",reversedSentence);
        return "reversed";
    }

    public String reverseString(String variable) {
        String str[]=variable.split("\\s");
        String reversedString = "";
        for(int i = str.length-1;i>=0;i--){
            reversedString+= str[i] + " ";
        }
        reversedString = reversedString.substring(0, reversedString.length() - 1);
        return reversedString;
    }

}

