package pl.aionpb.aion.recipes.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name ="client_combine_recipes_combine_recipe_expansion")
public class RecipeExpansionEntity implements Serializable {

    @JsonIgnore
    @Id
    @Column
    private Integer id;

    @JsonIgnore
    private String name;

    @Column(name = "component_quantity")
    private Integer componentQuantity;

    private String component1;
    @Column(name = "compo1_quantity")
    private Integer compo1Quantity;

    private String component2;
    @Column(name = "compo2_quantity")
    private Integer compo2Quantity;

    private String component3;
    @Column(name = "compo3_quantity")
    private Integer compo3Quantity;

    private String component4;
    @Column(name = "compo4_quantity")
    private Integer compo4Quantity;

    private String component5;
    @Column(name = "compo5_quantity")
    private Integer compo5Quantity;

    private String component6;
    @Column(name = "compo6_quantity")
    private Integer compo6Quantity;

    private String component7;
    @Column(name = "compo7_quantity")
    private Integer compo7Quantity;

    private String component8;
    @Column(name = "compo8_quantity")
    private Integer compo8Quantity;

    private String component9;
    @Column(name = "compo9_quantity")
    private Integer compo9Quantity;





    public RecipeExpansionEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getComponentQuantity() {
        return componentQuantity;
    }

    public void setComponentQuantity(Integer componentQuantity) {
        this.componentQuantity = componentQuantity;
    }

    public String getComponent1() {
        return component1;
    }

    public void setComponent1(String component1) {
        this.component1 = component1;
    }

    public String getComponent2() {
        return component2;
    }

    public void setComponent2(String component2) {
        this.component2 = component2;
    }

    public String getComponent3() {
        return component3;
    }

    public void setComponent3(String component3) {
        this.component3 = component3;
    }

    public String getComponent4() {
        return component4;
    }

    public void setComponent4(String component4) {
        this.component4 = component4;
    }

    public String getComponent5() {
        return component5;
    }

    public void setComponent5(String component5) {
        this.component5 = component5;
    }

    public String getComponent6() {
        return component6;
    }

    public void setComponent6(String component6) {
        this.component6 = component6;
    }

    public String getComponent7() {
        return component7;
    }

    public void setComponent7(String component7) {
        this.component7 = component7;
    }

    public String getComponent8() {
        return component8;
    }

    public void setComponent8(String component8) {
        this.component8 = component8;
    }

    public String getComponent9() {
        return component9;
    }

    public void setComponent9(String component9) {
        this.component9 = component9;
    }

    public Integer getCompo1Quantity() {
        return compo1Quantity;
    }

    public void setCompo1Quantity(Integer compo1Quantity) {
        this.compo1Quantity = compo1Quantity;
    }

    public Integer getCompo2Quantity() {
        return compo2Quantity;
    }

    public void setCompo2Quantity(Integer compo2Quantity) {
        this.compo2Quantity = compo2Quantity;
    }

    public Integer getCompo3Quantity() {
        return compo3Quantity;
    }

    public void setCompo3Quantity(Integer compo3Quantity) {
        this.compo3Quantity = compo3Quantity;
    }

    public Integer getCompo4Quantity() {
        return compo4Quantity;
    }

    public void setCompo4Quantity(Integer compo4Quantity) {
        this.compo4Quantity = compo4Quantity;
    }

    public Integer getCompo5Quantity() {
        return compo5Quantity;
    }

    public void setCompo5Quantity(Integer compo5Quantity) {
        this.compo5Quantity = compo5Quantity;
    }

    public Integer getCompo6Quantity() {
        return compo6Quantity;
    }

    public void setCompo6Quantity(Integer compo6Quantity) {
        this.compo6Quantity = compo6Quantity;
    }

    public Integer getCompo7Quantity() {
        return compo7Quantity;
    }

    public void setCompo7Quantity(Integer compo7Quantity) {
        this.compo7Quantity = compo7Quantity;
    }

    public Integer getCompo8Quantity() {
        return compo8Quantity;
    }

    public void setCompo8Quantity(Integer compo8Quantity) {
        this.compo8Quantity = compo8Quantity;
    }

    public Integer getCompo9Quantity() {
        return compo9Quantity;
    }

    public void setCompo9Quantity(Integer compo9Quantity) {
        this.compo9Quantity = compo9Quantity;
    }

}
