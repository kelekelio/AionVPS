package pl.aionpb.aion.assembles.entity;


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
@Table(name = "client_assembly_items_assemble_parts")
public class AssemblePartsEntity implements Serializable {


    @JsonIgnore
    @Id
    @Column
    private Integer id;

    @JsonIgnore
    @Column
    private String name;

    @Column(name = "part_item")
    private String partItem;

    @Column(name = "part_item_num")
    private Integer partItemNum;

    public AssemblePartsEntity() {
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

    public String getPartItem() {
        return partItem;
    }

    public void setPartItem(String partItem) {
        this.partItem = partItem;
    }

    public Integer getPartItemNum() {
        return partItemNum;
    }

    public void setPartItemNum(Integer partItemNum) {
        this.partItemNum = partItemNum;
    }
}
