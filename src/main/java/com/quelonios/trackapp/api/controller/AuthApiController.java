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
        return new ContactDTO(1L, "John", "Doe", "+57 311 222 3344", "john@sinbugs.com");
    }
}