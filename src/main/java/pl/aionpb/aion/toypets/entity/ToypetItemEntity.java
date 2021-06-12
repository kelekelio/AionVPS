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
@Table(name = "client_toypet_items")
public class ToypetItemEntity implements Serializable {

    @Id
    private Integer id;
    private String name;
    private String description;

    @Column(name = "desc_long")
    private String descLong;

    @Column(name = "attach_part")
    private String attachPart;

    public ToypetItemEntity() {
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

    public String getAttachPart() {
        return attachPart;
    }

    public void setAttachPart(String attachPart) {
        this.attachPart = attachPart;
    }
}
