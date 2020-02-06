
package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "asset_liability")
public class AssetLiability implements Serializable {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    @Size(max = 100)
    private String accountReceivable;
    private String liveStock;
    private String investmentGrowingCrops;
    private String investment ;
    private String realestate ;
    private String supplies;
    private String rentalLease ;
    private String incomeTaxSecurity;
    private String taxAndProperty;
    private String ccc;
    private String localCoopHerbicide;
    private String fertilizerOne;
    private String fertilizerTwo;
    private String currentLiabilitySchedules;
    private String totalCurrentLiabilityAmount;
    private String intermidiateLiabilityAmount;

    public String getOwnerEquityAmount() {
        return ownerEquityAmount;
    }

    public void setOwnerEquityAmount(String ownerEquityAmount) {
        this.ownerEquityAmount = ownerEquityAmount;
    }

    private String ownerEquityAmount;
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability",orphanRemoval = true)

    private List<FdAccount>fdAccount=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<SavingAccount>savingAccount= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<MarketSecurityAccount>marketSecurityAccount= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<CheckingAccount>checkingAccount= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<LongTermLiability>longTermLiability= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<IntermediateAssetAmount>intermediateAsset=new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<Obj>obj= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<LeaseObligation>leaseObligation= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<CreditCards>creditCards= new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL,  mappedBy = "assetLiability")
    private List<AccruedInterest>accruedInterest= new ArrayList<>();


    public void setLongTermLiability(List<LongTermLiability> longTermLiability) {
        this.longTermLiability = longTermLiability;
    }
    public List<LongTermLiability> getLongTermLiability() {
        return longTermLiability;
    }
    public List<IntermediateAssetAmount> getIntermediateAsset() {
        return intermediateAsset;
    }

    public void setIntermediateAsset(List<IntermediateAssetAmount> intermediateAsset) {
        this.intermediateAsset = intermediateAsset;
    }

    public List<Obj> getObj() {
        return obj;
    }

    public void setObj(List<Obj> obj) {
        this.obj = obj;
    }

    public List<com.registration.springangular.domain.LeaseObligation> getLeaseObligation() {
        return this.leaseObligation;
    }

    public void setLeaseObligation(List<com.registration.springangular.domain.LeaseObligation> leaseObligation) {
        this.leaseObligation = leaseObligation;
    }

    public List<CreditCards> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCards> creditCards) {
        this.creditCards = creditCards;
    }

    public List<AccruedInterest> getAccruedInterest() {
        return accruedInterest;
    }

    public void setAccruedInterest(List<AccruedInterest> accruedInterest) {
        this.accruedInterest = accruedInterest;
    }

    public String getRentalLease() {
        return rentalLease;
    }

    public void setRentalLease(String rentalLease) {
        this.rentalLease = rentalLease;
    }

    public String getIncomeTaxSecurity() {
        return incomeTaxSecurity;
    }

    public void setIncomeTaxSecurity(String incomeTaxSecurity) {
        this.incomeTaxSecurity = incomeTaxSecurity;
    }

    public String getTaxAndProperty() {
        return taxAndProperty;
    }

    public void setTaxAndProperty(String taxAndProperty) {
        this.taxAndProperty = taxAndProperty;
    }

    public String getCcc() {
        return ccc;
    }

    public void setCcc(String ccc) {
        this.ccc = ccc;
    }

    public String getLocalCoopHerbicide() {
        return localCoopHerbicide;
    }

    public void setLocalCoopHerbicide(String localCoopHerbicide) {
        this.localCoopHerbicide = localCoopHerbicide;
    }

    public String getFertilizerOne() {
        return fertilizerOne;
    }

    public void setFertilizerOne(String fertilizerOne) {
        this.fertilizerOne = fertilizerOne;
    }

    public String getFertilizerTwo() {
        return fertilizerTwo;
    }

    public void setFertilizerTwo(String fertilizerTwo) {
        this.fertilizerTwo = fertilizerTwo;
    }

    public String getCurrentLiabilitySchedules() {
        return currentLiabilitySchedules;
    }

    public void setCurrentLiabilitySchedules(String currentLiabilitySchedules) {
        this.currentLiabilitySchedules = currentLiabilitySchedules;
    }

    public String getTotalCurrentLiabilityAmount() {
        return totalCurrentLiabilityAmount;
    }

    public void setTotalCurrentLiabilityAmount(String totalCurrentLiabilityAmount) {
        this.totalCurrentLiabilityAmount = totalCurrentLiabilityAmount;
    }

    public String getIntermidiateLiabilityAmount() {
        return intermidiateLiabilityAmount;
    }

    public void setIntermidiateLiabilityAmount(String intermidiateLiabilityAmount) {
        this.intermidiateLiabilityAmount = intermidiateLiabilityAmount;
    }




    public String getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(String accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

    public String getLiveStock() {
        return liveStock;
    }

    public void setLiveStock(String liveStock) {
        this.liveStock = liveStock;
    }

    public String getInvestmentGrowingCrops() {
        return investmentGrowingCrops;
    }

    public void setInvestmentGrowingCrops(String investmentGrowingCrops) {
        this.investmentGrowingCrops = investmentGrowingCrops;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public String getRealestate() {
        return realestate;
    }

    public void setRealestate(String realestate) {
        this.realestate = realestate;
    }


    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }

    public List<FdAccount> getFdAccount() {
        return fdAccount;
    }

    public void setFdAccount(List<FdAccount> fdAccount) {
        this.fdAccount = fdAccount;
    }

    public List<SavingAccount> getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(List<SavingAccount> savingAccount) {
        this.savingAccount = savingAccount;
    }

    public List<MarketSecurityAccount> getMarketSecurityAccount() {
        return marketSecurityAccount;
    }

    public void setMarketSecurityAccount(List<MarketSecurityAccount> marketSecurityAccount) {
        this.marketSecurityAccount = marketSecurityAccount;
    }

    public List<CheckingAccount> getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(List<CheckingAccount> checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;

}
