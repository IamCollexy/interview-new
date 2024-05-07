package com.example.gititfininterview.controllers;

import com.example.gititfininterview.requests.CreateContactsRequest;
import com.example.gititfininterview.requests.CreatePaygoBeneficiaryRequest;
import com.example.gititfininterview.requests.LoginRequest;
import com.example.gititfininterview.services.IContacts;
import com.gitittech.paygo.commons.dtos.User;
import com.gitittech.paygo.commons.dtos.UserWithToken;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private final IContacts contactService;

    @Autowired
    public ContactController(@Qualifier("contact") IContacts contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity getContacts(
            @RequestParam(value = "name", defaultValue = "false") Boolean name,
            @RequestParam(value = "email", defaultValue = "") String email,
                   @RequestParam(value = "phoneNumber") List<String> phoneNumber) throws Throwable {   var contacts = contactService.getAllContacts();

            return ResponseEntity.ok(contacts);
    }

    @PostMapping("/")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity saveContact(final @RequestBody @Valid CreateContactsRequest contact) throws Throwable{ return ResponseEntity.ok().build();}
}
