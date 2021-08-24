package com.codewithcup.microservice.contactService.controller;

import com.codewithcup.microservice.contactService.entity.Contact;
import com.codewithcup.microservice.contactService.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contact> getListContact(@PathVariable("userId") Long userId){

        return contactService.getConatact(userId);
    }
}
