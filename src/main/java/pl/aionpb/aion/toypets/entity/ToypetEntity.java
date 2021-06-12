package pl.aionpb.aion.toypets.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name = "client_toypets")
public class ToypetEntity implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String description;

    @Column(name = "desc_long")
    private String descLong;

    @Column(name = "icon_name")
    private String iconName;

    private String dir;
    private String mesh;
    private String color;

    @Column(name = "pet_condition_reward")
    private String petConditionReward;

    @Column(name = "combat_reaction")
    private String combatReaction;

    @Column(name = "func_type1")
    private String funcType1;

    @Column(name = "func_type_name1")
    private String funcTypeName1;

    @Column(name = "func_type2")
    private String funcType2;

    @Column(name = "func_type_name2")
    private String funcTypeName2;

    @Transient
    private Object function1;

    @Transient
    private Object function2;

    @Column(name = "enemy_alarm")
    private Boolean enemyAlarm;





    public ToypetEntity() {
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

    public String getDescLong() {
        return descLong;
    }

    public void setDescLong(String descLong) {
        this.descLong = descLong;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getMesh() {
        return mesh;
    }

    public void setMesh(String mesh) {
        this.mesh = mesh;
    }

    public String getPetConditionReward() {
        return petConditionReward;
    }

    public void setPetConditionReward(String petConditionReward) {
        this.petConditionReward = petConditionReward;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombatReaction() {
        return combatReaction;
    }

    public void setCombatReaction(String combatReaction) {
        this.combatReaction = combatReaction;
    }

    public String getFuncType1() {
        return funcType1;
    }

    public void setFuncType1(String funcType1) {
        this.funcType1 = funcType1;
    }

    public String getFuncTypeName1() {
        return funcTypeName1;
    }

    public void setFuncTypeName1(String funcTypeName1) {
        this.funcTypeName1 = funcTypeName1;
    }

    public String getFuncType2() {
        return funcType2;
    }

    public void setFuncType2(String funcType2) {
        this.funcType2 = funcType2;
    }

    public String getFuncTypeName2() {
        return funcTypeName2;
    }

    public void setFuncTypeName2(String funcTypeName2) {
        this.funcTypeName2 = funcTypeName2;
    }

    public Boolean getEnemyAlarm() {
        return enemyAlarm;
    }

    public void setEnemyAlarm(Boolean enemyAlarm) {
        this.enemyAlarm = enemyAlarm;
    }

    public Object getFunction1() {
        return function1;
    }

    public void setFunction1(Object function1) {
        this.function1 = function1;
    }

    public Object getFunction2() {
        return function2;
    }

    public void setFunction2(Object function2) {
        this.function2 = function2;
    }
}
