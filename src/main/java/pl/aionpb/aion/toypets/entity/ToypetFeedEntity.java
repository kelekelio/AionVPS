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
@Table(name = "client_toypet_feeds")
public class ToypetFeedEntity implements Serializable {

    @Id
    private Integer id;

    private String name;
    private String description;

    @Column(name = "favorite_flavor_desc")
    private String favoriteFlavorDesc;

    @Column(name = "love_flavor_id_1")
    private Integer loveFlavorId1;

    @Column(name = "love_flavor_id_2")
    private Integer loveFlavorId2;

    @Column(name = "love_flavor_id_3")
    private Integer loveFlavorId3;

    @Column(name = "love_flavor_id_4")
    private Integer loveFlavorId4;

    @Column(name = "love_flavor_desc_1")
    private String loveFlavorDesc1;

    @Column(name = "love_flavor_desc_2")
    private String loveFlavorDesc2;

    @Column(name = "love_flavor_desc_3")
    private String loveFlavorDesc3;

    @Column(name = "love_flavor_desc_4")
    private String loveFlavorDesc4;

    @Column(name = "feeding_count")
    private Integer feedingCount;

    @Column(name = "feeding_cooltime")
    private Integer feedingCooltime;

    @Column(name = "limit_love_count")
    private Integer limitLoveCount;

    @Column(name = "favorite_flavor_id")
    private Integer favoriteFlavorId;

    public ToypetFeedEntity() {
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

    public String getFavoriteFlavorDesc() {
        return favoriteFlavorDesc;
    }

    public void setFavoriteFlavorDesc(String favoriteFlavorDesc) {
        this.favoriteFlavorDesc = favoriteFlavorDesc;
    }

    public Integer getLoveFlavorId1() {
        return loveFlavorId1;
    }

    public void setLoveFlavorId1(Integer loveFlavorId1) {
        this.loveFlavorId1 = loveFlavorId1;
    }

    public Integer getLoveFlavorId2() {
        return loveFlavorId2;
    }

    public void setLoveFlavorId2(Integer loveFlavorId2) {
        this.loveFlavorId2 = loveFlavorId2;
    }

    public Integer getLoveFlavorId3() {
        return loveFlavorId3;
    }

    public void setLoveFlavorId3(Integer loveFlavorId3) {
        this.loveFlavorId3 = loveFlavorId3;
    }

    public Integer getLoveFlavorId4() {
        return loveFlavorId4;
    }

    public void setLoveFlavorId4(Integer loveFlavorId4) {
        this.loveFlavorId4 = loveFlavorId4;
    }

    public String getLoveFlavorDesc1() {
        return loveFlavorDesc1;
    }

    public void setLoveFlavorDesc1(String loveFlavorDesc1) {
        this.loveFlavorDesc1 = loveFlavorDesc1;
    }

    public String getLoveFlavorDesc2() {
        return loveFlavorDesc2;
    }

    public void setLoveFlavorDesc2(String loveFlavorDesc2) {
        this.loveFlavorDesc2 = loveFlavorDesc2;
    }

    public String getLoveFlavorDesc3() {
        return loveFlavorDesc3;
    }

    public void setLoveFlavorDesc3(String loveFlavorDesc3) {
        this.loveFlavorDesc3 = loveFlavorDesc3;
    }

    public String getLoveFlavorDesc4() {
        return loveFlavorDesc4;
    }

    public void setLoveFlavorDesc4(String loveFlavorDesc4) {
        this.loveFlavorDesc4 = loveFlavorDesc4;
    }

    public Integer getFeedingCount() {
        return feedingCount;
    }

    public void setFeedingCount(Integer feedingCount) {
        this.feedingCount = feedingCount;
    }

    public Integer getFeedingCooltime() {
        return feedingCooltime;
    }

    public void setFeedingCooltime(Integer feedingCooltime) {
        this.feedingCooltime = feedingCooltime;
    }

    public Integer getLimitLoveCount() {
        return limitLoveCount;
    }

    public void setLimitLoveCount(Integer limitLoveCount) {
        this.limitLoveCount = limitLoveCount;
    }

    public Integer getFavoriteFlavorId() {
        return favoriteFlavorId;
    }

    public void setFavoriteFlavorId(Integer favoriteFlavorId) {
        this.favoriteFlavorId = favoriteFlavorId;
    }
}