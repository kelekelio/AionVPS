package pl.aionpb.aion.dungeons.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name = "client_instance_cooltimes")
public class DungeonEntity {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String race;

    public DungeonEntity(Integer id, String name, String description, String race) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.race = race;
    }

    public DungeonEntity() {
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}