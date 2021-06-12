package pl.aionpb.aion.toypets.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name = "client_toypet_lootings")
public class ToypetLootingEntity implements Serializable {

    @Id
    private Integer id;

    private String name;

    private String description;

    public ToypetLootingEntity() {
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
}
