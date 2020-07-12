package com.quelonios.trackapp.api.controller;

import com.quelonios.trackapp.dto.ContactDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthApiController {
    
    @RequestMapping(value="/contact", method=RequestMethod.GET)
    public ContactDTO getById(){
        return new ContactDTO(1L, "Lalo", "Hernandez", "+57 518 555 105", "gerardo.hernandez@sinbugs.com");
    }
}