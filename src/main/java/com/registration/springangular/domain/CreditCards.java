package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "credit_card")
public class CreditCards implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creditCardAccountNumber;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_liability_id")
    private AssetLiability assetLiability;

    public String getCreditCardAccountNumber() {
        return creditCardAccountNumber;
    }

    public void setCreditCardAccountNumber(String creditCardAccountNumber) {
        this.creditCardAccountNumber = creditCardAccountNumber;
    }

    public String getCreditCardAmount() {
        return creditCardAmount;
    }

    public void setCreditCardAmount(String creditCardAmount) {
        this.creditCardAmount = creditCardAmount;
    }

    private String creditCardAmount;
}
