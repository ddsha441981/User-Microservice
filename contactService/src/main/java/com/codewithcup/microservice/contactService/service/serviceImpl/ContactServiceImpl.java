package com.codewithcup.microservice.contactService.service.serviceImpl;

import com.codewithcup.microservice.contactService.entity.Contact;
import com.codewithcup.microservice.contactService.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

//    Contact Fake Service

    List<Contact> contactList = Arrays.asList(
            new Contact(201L, "kkumawat1@gmail.com", "A1", 1111L),
            new Contact(202L, "kkumawat11@gmail.com", "A2", 1111L),
            new Contact(203L, "kkumawat111@gmail.com", "A3", 1114L),
            new Contact(204L, "kkumawat1111@gmail.com", "A4", 1115L),

            new Contact(205L, "abc@gmail.com", "B1", 1112L),
            new Contact(206L, "kkumawat11@gmail.com", "B2", 1112L),
            new Contact(207L, "kkumawat111@gmail.com", "B3", 1113L),
            new Contact(208L, "kkumawat1111@gmail.com", "B4", 1114L)

    );

    @Override
    public List<Contact> getConatact(Long userId) {
        return this.contactList.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
