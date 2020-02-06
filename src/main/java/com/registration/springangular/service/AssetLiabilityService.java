package com.registration.springangular.service;

import com.registration.springangular.domain.Home;
import com.registration.springangular.domain.LoanAndReferenceType;
import com.registration.springangular.repository.LoanAndReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AssetLiabilityService {
    @Autowired
    private LoanAndReferenceRepository loanAndReferenceRepository;

    public List<Home> getHomeObject(String referenceNumber) {
        Optional<LoanAndReferenceType> loanAndReferenceType=loanAndReferenceRepository.findByReferenceNumber(referenceNumber);
        LoanAndReferenceType loanAndReferenceTypeObj= loanAndReferenceType.get();
        return loanAndReferenceTypeObj.getHomeList();
    }

    public void saveAndUpdateHomeObject(LoanAndReferenceType loanAndReferenceType) {
        Optional<String> referenceNumber=Optional.ofNullable(loanAndReferenceType.getReferenceNumber());
         Optional<LoanAndReferenceType>loanAndReferenceType1= loanAndReferenceRepository.findByReferenceNumber(referenceNumber.get());
         if(loanAndReferenceType1.isPresent()) {
             LoanAndReferenceType loanAndReferenceTypeObj= new LoanAndReferenceType();
          LoanAndReferenceType loanAndReferenceType2 = loanAndReferenceType1.get();
          List<Home> finalList = loanAndReferenceType2.getHomeList();
          List<Home>list=loanAndReferenceType.getHomeList();
             finalList.addAll(list);
             loanAndReferenceTypeObj.setHomeList(finalList);
             loanAndReferenceTypeObj.setLoanType(loanAndReferenceType.getLoanType());
             loanAndReferenceTypeObj.setReferenceNumber(loanAndReferenceType.getReferenceNumber());
             loanAndReferenceRepository.save(loanAndReferenceTypeObj);
      }
else
             loanAndReferenceRepository.save(loanAndReferenceType);
    }

    public List<String> getAllReferenceDetail() {
       Iterable<LoanAndReferenceType>loanAndReferenceTypeIterable= loanAndReferenceRepository.findAll();
    List<String>stringList= new ArrayList<>();
       loanAndReferenceTypeIterable.forEach((loanAndReferenceType)->{
  String referenceNumber=loanAndReferenceType.getReferenceNumber();
stringList.add(referenceNumber);
        });
       return  stringList;
    }
}
