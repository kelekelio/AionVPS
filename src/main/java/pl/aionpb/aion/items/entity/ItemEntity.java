package pl.aionpb.aion.items.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name = "client_items")
public class ItemEntity {

    @Id
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;

    @Column(name = "desc_long")
    private String descLong;

    @Column(name = "icon_name")
    private String iconName;

    @Column(name = "equipment_slots")
    private String equipmentSlots;

    @Column(name = "weapon_type")
    private String weaponType;

    @Column(name = "armor_type")
    private String armorType;

    @Column
    private String quality;

    @Column
    private Integer price;

    @Column
    private Integer level;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "driven_enchant_type")
    private String drivenEnchantType;

    @Column(name = "client_version")
    private String clientVersion;



    @Column(name = "search_ko")
    private String ko;

    @Column(name = "search_en")
    private String en;

    @Column(name = "search_de")
    private String de;



















    public ItemEntity() {
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

    public String getEquipmentSlots() {
        return equipmentSlots;
    }

    public void setEquipmentSlots(String equipmentSlots) {
        this.equipmentSlots = equipmentSlots;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getDrivenEnchantType() {
        return drivenEnchantType;
    }

    public void setDrivenEnchantType(String drivenEnchantType) {
        this.drivenEnchantType = drivenEnchantType;
    }
}