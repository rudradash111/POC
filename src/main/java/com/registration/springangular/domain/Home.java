package  com.registration.springangular.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "home_entity")
@Entity
@Getter
@Setter
public class Home {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    private String field;
    private String assetLiability;
    private String assetLiabilityType;
    private String dataSource;
    private String value1;
    private String value2;
    private String value3;
    private String typeofValue;
    private String formulaLogic;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getAssetLiability() {
        return assetLiability;
    }

    public void setAssetLiability(String assetLiability) {
        this.assetLiability = assetLiability;
    }

    public String getAssetLiabilityType() {
        return assetLiabilityType;
    }

    public void setAssetLiabilityType(String assetLiabilityType) {
        this.assetLiabilityType = assetLiabilityType;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getTypeofValue() {
        return typeofValue;
    }

    public void setTypeofValue(String typeofValue) {
        this.typeofValue = typeofValue;
    }

    public String getFormulaLogic() {
        return formulaLogic;
    }

    public void setFormulaLogic(String formulaLogic) {
        this.formulaLogic = formulaLogic;
    }

}
