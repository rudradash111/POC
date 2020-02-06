package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "checking_account")
@Entity
public class CheckingAccount {
  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Long id;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "asset_liability_id")
  private AssetLiability assetLiability;

  public String getCheckingAccountNumber() {
    return checkingAccountNumber;
  }

  public void setCheckingAccountNumber(String checkingAccountNumber) {
    this.checkingAccountNumber = checkingAccountNumber;
  }

  public String getCheckingAmount() {
    return checkingAmount;
  }

  public void setCheckingAmount(String checkingAmount) {
    this.checkingAmount = checkingAmount;
  }

  String  checkingAccountNumber;
  String  checkingAmount;
}
