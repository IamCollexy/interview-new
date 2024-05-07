package com.example.gititfininterview.controllers;

import com.example.gititfininterview.requests.CreatePaygoBeneficiaryRequest;
import com.example.gititfininterview.services.IBeneficiary;
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
@RequestMapping("/paygo_beneficiaries")
public class PaygoBeneficiariesController {

    private final IBeneficiary paygoBeneficiaryService;

    @Autowired
    public PaygoBeneficiariesController(@Qualifier("paygo") IBeneficiary paygoBeneficiaryService) {
        this.paygoBeneficiaryService = paygoBeneficiaryService;
    }

    @GetMapping("/")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity getPaygoBeneficiaries(
            @RequestParam(value = "isSearch", defaultValue = "false") Boolean isSearch,
            @RequestParam(value = "filter", defaultValue = "") String filter,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "20") Integer size,
            @RequestParam(value = "direction", defaultValue = "DESC") String direction,
            @RequestParam(value = "property") List<String> properties) throws Throwable {
            return ResponseEntity.ok(paygoBeneficiaryService.getAllBeneficiaries(isSearch, filter, page, size, direction, properties));      
    }
    
    @PostMapping("/")
    @SecurityRequirement(name = "Bearer Authentication")
    public ResponseEntity createBeneificiaries(final @RequestBody @Valid CreatePaygoBeneficiaryRequest request) throws Throwable {
        return ResponseEntity.ok().build();
    }
       
}
