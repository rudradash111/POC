package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter

@Entity
@Table(name = "lease_obligation")
public class LeaseObligation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String paymentAmountLeaseObligation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_liability_id")

    private AssetLiability assetLiability;
}
