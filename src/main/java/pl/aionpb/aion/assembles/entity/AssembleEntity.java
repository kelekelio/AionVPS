package pl.aionpb.aion.assembles.entity;


import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name = "client_assembly_items")
public class AssembleEntity implements Serializable {

    @Id
    @Column
    private Integer id;

    @Column(name = "name")
    private String name;


    @Column(name = "part_critical_prob")
    private Integer partCriticalProb;

    @Column(name = "part_critical_name")
    private String partCriticalName;


    @OneToMany
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(
            name = "name",
            referencedColumnName = "name",
            insertable = false,
            updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private List<AssemblePartsEntity> assembleParts;






    public AssembleEntity() {
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

    public Integer getPartCriticalProb() {
        return partCriticalProb;
    }

    public void setPartCriticalProb(Integer partCriticalProb) {
        this.partCriticalProb = partCriticalProb;
    }

    public String getPartCriticalName() {
        return partCriticalName;
    }

    public void setPartCriticalName(String partCriticalName) {
        this.partCriticalName = partCriticalName;
    }

    public List<AssemblePartsEntity> getAssembleParts() {
        return assembleParts;
    }

    public void setAssembleParts(List<AssemblePartsEntity> assembleParts) {
        this.assembleParts = assembleParts;
    }
}