package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "lender_collateral_rate_paymentAmount")
public class Obj  implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  lender;
    private String collateral;
    private String rate;
    private String paymentAmount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_liability_id")
    private AssetLiability assetLiability;
}
