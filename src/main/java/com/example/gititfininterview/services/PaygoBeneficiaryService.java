package com.example.gititfininterview.services;

import com.example.gititfininterview.repositories.IPaygoBeneficiaryRepository;
import com.example.gititfininterview.repositories.IUserBeneficiaryRepository;
import com.example.gititfininterview.repositories.IUserReadRepository;
import com.gitittech.paygo.commons.dtos.PaygoBeneficiary;
import org.springframework.data.domain.Page;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.gitittech.paygo.commons.dtos.Task;

public class PaygoBeneficiaryService implements IBeneficiary<PaygoBeneficiary> {

    final private IUser userService;
    final private IPaygoBeneficiaryRepository repository;
    final private IUserBeneficiaryRepository userBeneficiaryRepository;
    final private IUserReadRepository userReadRepository;
    final private IBackgroundJob taskService;

    @Autowired
    public PaygoBeneficiaryService(IUser userService,
            IUserBeneficiaryRepository userBeneficiaryRepository,
            IUserReadRepository userReadRepository,
            IBackgroundJob taskService,
            IPaygoBeneficiaryRepository readRepository) {
        this.userService = userService;
        this.repository = readRepository;
        this.userBeneficiaryRepository = userBeneficiaryRepository;
        this.userReadRepository = userReadRepository;
        this.taskService = taskService;
    }

    @Override
    public Page<PaygoBeneficiary> getAllBeneficiaries(Boolean isSearch, String filter, Integer page, Integer size, String direction, List<String> properties) throws Throwable {
        throw new UnsupportedOperationException("Not supported yet.");
    }  

    @Override
    public Task createOrLinkBenefiaries(List<PaygoBeneficiary> beneficiaries) throws Throwable {
       throw new UnsupportedOperationException("Not supported yet.");
    }

}
