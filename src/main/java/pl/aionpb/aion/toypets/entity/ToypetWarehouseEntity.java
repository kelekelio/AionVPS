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
@Table(name = "client_toypet_warehouses")
public class ToypetWarehouseEntity implements Serializable {

    @Id
    @Column
    private Integer id;

    private String name;

    private String description;

    @Column(name = "warehouse_slot_count")
    private Integer warehouseSlotCount;

    @Column(name = "warehouse_slot_type")
    private String warehouseSlotType;

    public ToypetWarehouseEntity() {
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

    public Integer getWarehouseSlotCount() {
        return warehouseSlotCount;
    }

    public void setWarehouseSlotCount(Integer warehouseSlotCount) {
        this.warehouseSlotCount = warehouseSlotCount;
    }

    public String getWarehouseSlotType() {
        return warehouseSlotType;
    }

    public void setWarehouseSlotType(String warehouseSlotType) {
        this.warehouseSlotType = warehouseSlotType;
    }
}
