package pl.aionpb.aion.recipes.entity;


import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name ="client_combine_recipes")
public class RecipeEntity implements Serializable {

    @Id
    @Column
    private Integer id;
    private String name;
    private String description;
    private String combineskill;
    @Column(name = "qualification_race")
    private String qualificationRace;
    @Column(name = "required_skillpoint")
    private Integer requiredSkillpoint;
    @Column(name = "auto_learn")
    private Integer autoLearn;
    private String product;
    @Column(name = "product_quantity")
    private Integer productQuantity;
    @Column(name = "require_dp")
    private Integer requireDp;
    @Column(name = "max_production_count")
    private Integer maxProductionCount;
    @Column(name = "desc_craftman")
    private String descCraftman;
    @Column(name = "craft_delay_id")
    private Integer craftDelayId;
    @Column(name = "craft_delay_time")
    private Integer craftDelayTime;
    @Column(name = "task_type")
    private Integer taskType;

    @Column(name = "combo1_product")
    private String combo1Product;
    @Column(name = "combo2_product")
    private String combo2Product;
    @Column(name = "combo3_product")
    private String combo3Product;
    @Column(name = "combo4_product")
    private String combo4Product;

    @OneToMany
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(
            name = "name",
            referencedColumnName = "name",
            insertable = false,
            updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private List<RecipeExpansionEntity> combineRecipeExpansion;


    public RecipeEntity() {
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

    public String getCombineskill() {
        return combineskill;
    }

    public void setCombineskill(String combineskill) {
        this.combineskill = combineskill;
    }

    public String getQualificationRace() {
        return qualificationRace;
    }

    public void setQualificationRace(String qualificationRace) {
        this.qualificationRace = qualificationRace;
    }

    public Integer getRequiredSkillpoint() {
        return requiredSkillpoint;
    }

    public void setRequiredSkillpoint(Integer requiredSkillpoint) {
        this.requiredSkillpoint = requiredSkillpoint;
    }

    public Integer getAutoLearn() {
        return autoLearn;
    }

    public void setAutoLearn(Integer autoLearn) {
        this.autoLearn = autoLearn;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Integer getRequireDp() {
        return requireDp;
    }

    public void setRequireDp(Integer requireDp) {
        this.requireDp = requireDp;
    }

    public Integer getMaxProductionCount() {
        return maxProductionCount;
    }

    public void setMaxProductionCount(Integer maxProductionCount) {
        this.maxProductionCount = maxProductionCount;
    }

    public String getDescCraftman() {
        return descCraftman;
    }

    public void setDescCraftman(String descCraftman) {
        this.descCraftman = descCraftman;
    }

    public Integer getCraftDelayId() {
        return craftDelayId;
    }

    public void setCraftDelayId(Integer craftDelayId) {
        this.craftDelayId = craftDelayId;
    }

    public Integer getCraftDelayTime() {
        return craftDelayTime;
    }

    public void setCraftDelayTime(Integer craftDelayTime) {
        this.craftDelayTime = craftDelayTime;
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getCombo1Product() {
        return combo1Product;
    }

    public void setCombo1Product(String combo1Product) {
        this.combo1Product = combo1Product;
    }

    public String getCombo2Product() {
        return combo2Product;
    }

    public void setCombo2Product(String combo2Product) {
        this.combo2Product = combo2Product;
    }

    public String getCombo3Product() {
        return combo3Product;
    }

    public void setCombo3Product(String combo3Product) {
        this.combo3Product = combo3Product;
    }

    public String getCombo4Product() {
        return combo4Product;
    }

    public void setCombo4Product(String combo4Product) {
        this.combo4Product = combo4Product;
    }

    public List<RecipeExpansionEntity> getCombineRecipeExpansion() {
        return combineRecipeExpansion;
    }

    public void setCombineRecipeExpansion(List<RecipeExpansionEntity> combineRecipeExpansion) {
        this.combineRecipeExpansion = combineRecipeExpansion;
    }
}
