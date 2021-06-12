package pl.aionpb.aion.items.object;


import pl.aionpb.aion.db.object.Settings;
import pl.aionpb.aion.items.entity.ItemEntity;

/**
 * @author Grzegorz Nowakowski
 */
public class ItemObj {


    private ItemEntity itemEntity;

    private String description;
    private String descLong;
    private String price;
    private String iconName;

    public ItemObj() {
    }

    public ItemEntity getItemEntity() {
        return itemEntity;
    }

    public void setItemEntity(ItemEntity itemEntity) {
        this.itemEntity = itemEntity;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public static String finalIconLink(String iconName) {

        return "<img class=\"thumb\" src=\"/server/" + Settings.getServerId() + "/item/icon/" + iconFix(iconName) + ".png\" width=\"37\" height=\"37\" alt=\"\">";
    }

    public static String iconFix(String iconName) {
        return iconName.replaceAll(".dds", "").toLowerCase();
    }


}