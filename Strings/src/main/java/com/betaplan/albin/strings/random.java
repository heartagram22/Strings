package com.betaplan.albin.strings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class random {
    @RequestMapping("/random")
    public String random(){
        return "Spring boot is great! So easy to understand :D ";
    }
    }


