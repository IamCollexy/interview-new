package com.example.gititfininterview.repositories;

import com.gitittech.paygo.commons.entities.JpaPaygoBeneficiary;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface IPaygoBeneficiaryRepository extends JpaRepository<JpaPaygoBeneficiary, String> {              
        
    Optional<JpaPaygoBeneficiary> findByPhone(String phone);
}
