package com.codewithcup.microservice.contactService.service;

import com.codewithcup.microservice.contactService.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getConatact(Long userId);
}
