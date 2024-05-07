package com.example.gititfininterview.services;

import com.gitittech.paygo.commons.dtos.Beneficiary;


import java.util.List;
import java.util.Optional;

public interface IContacts<S> {

    Beneficiary saveContact(String name,
String email, List<String> phoneNumbers) throws Throwable;
Optional<Beneficiary> getAllContacts() throws Throwable;
}
