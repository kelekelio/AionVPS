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
@Table(name = "client_toypet_dopings")
public class ToypetDopingEntity implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String description;

    @Column(name = "use_doping_scroll")
    private Integer useDopingScroll;

    @Column(name = "use_doping_food")
    private Boolean useDopingFood;

    @Column(name = "use_doping_drink")
    private Boolean useDopingDrink;

    public ToypetDopingEntity() {
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

    public Integer getUseDopingScroll() {
        return useDopingScroll;
    }

    public void setUseDopingScroll(Integer useDopingScroll) {
        this.useDopingScroll = useDopingScroll;
    }

    public Boolean getUseDopingFood() {
        return useDopingFood;
    }

    public void setUseDopingFood(Boolean useDopingFood) {
        this.useDopingFood = useDopingFood;
    }

    public Boolean getUseDopingDrink() {
        return useDopingDrink;
    }

    public void setUseDopingDrink(Boolean useDopingDrink) {
        this.useDopingDrink = useDopingDrink;
    }
}
