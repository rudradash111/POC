package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "longTerm_liability")
public class LongTermLiability implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String  lenderLL;
   private String collateralLL;
   private  String rateLL;
   private String paymentAmountLL;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "asset_liability_id")
   private AssetLiability assetLiability;
}
