package pl.aionpb.aion.toypets.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name = "client_toypet_buffs")
public class ToypetBuffEntity implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String description;

    @Column(name = "food_item")
    private String foodItem;
    @Column(name = "food_consume_count")
    private Integer foodConsumeCount;


    @Column(name = "bonus_attr1")
    private String bonusAttr1;
    @Column(name = "bonus_attr2")
    private String bonusAttr2;
    @Column(name = "bonus_attr3")
    private String bonusAttr3;
    @Column(name = "bonus_attr4")
    private String bonusAttr4;
    @Column(name = "bonus_attr5")
    private String bonusAttr5;

    public ToypetBuffEntity() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public Integer getFoodConsumeCount() {
        return foodConsumeCount;
    }

    public void setFoodConsumeCount(Integer foodConsumeCount) {
        this.foodConsumeCount = foodConsumeCount;
    }

    public String getBonusAttr1() {
        return bonusAttr1;
    }

    public void setBonusAttr1(String bonusAttr1) {
        this.bonusAttr1 = bonusAttr1;
    }

    public String getBonusAttr2() {
        return bonusAttr2;
    }

    public void setBonusAttr2(String bonusAttr2) {
        this.bonusAttr2 = bonusAttr2;
    }

    public String getBonusAttr3() {
        return bonusAttr3;
    }

    public void setBonusAttr3(String bonusAttr3) {
        this.bonusAttr3 = bonusAttr3;
    }

    public String getBonusAttr4() {
        return bonusAttr4;
    }

    public void setBonusAttr4(String bonusAttr4) {
        this.bonusAttr4 = bonusAttr4;
    }

    public String getBonusAttr5() {
        return bonusAttr5;
    }

    public void setBonusAttr5(String bonusAttr5) {
        this.bonusAttr5 = bonusAttr5;
    }

}
