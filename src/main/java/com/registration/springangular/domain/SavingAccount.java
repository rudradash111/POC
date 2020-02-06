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
@Table(name = "saving_account")
public class SavingAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String savingAccountNumber;
 String         savingAmount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_liability_id")
    private AssetLiability assetLiability;
}
