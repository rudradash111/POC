package com.registration.springangular.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "market_security_account")
public class MarketSecurityAccount implements Serializable {
    private static final long serialVersionUID = 1L;
  @Id
          @GeneratedValue(strategy = GenerationType.AUTO)
          private Long id;
  String  marketSecurityAccountNumber;
  String          marketSecurityAmount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_liability_id")
    private AssetLiability assetLiability;
}
