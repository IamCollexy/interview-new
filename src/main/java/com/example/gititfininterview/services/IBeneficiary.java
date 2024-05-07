package com.example.gititfininterview.services;


import com.gitittech.paygo.commons.dtos.Task;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IBeneficiary<S> {

    Task createOrLinkBenefiaries(List<S> beneficiaries) throws Throwable;

    Page<S> getAllBeneficiaries(Boolean isSearch, String filter, Integer page, 
            Integer size, String direction, List<String> properties) throws Throwable;

}
