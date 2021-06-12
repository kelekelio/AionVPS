package pl.aionpb.aion.familiars.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Grzegorz Nowakowski
 */
@Entity
@Table(name ="client_familiars")
public class FamiliarEntity {

    @Id
    @Column
    private Integer id;

    private String name;
    private String description;
    private String descLong;
    private String descStory;
    private String dir;
    private String mesh;

    @Column(name = "tier_grade")
    private String tierGrade;

    @Column(name = "star_grade")
    private Integer starGrade;

    @Column(name = "is_only_feeds")
    private Boolean isOnlyFeeds;

    @Column(name = "use_func_option")
    private Boolean useFuncOption;

    @Column(name = "physical_bonus_attr1")
    private String physicalBonusAttr1;

    @Column(name = "physical_bonus_attr2")
    private String physicalBonusAttr2;

    @Column(name = "physical_bonus_attr3")
    private String physicalBonusAttr3;

    @Column(name = "physical_bonus_attr4")
    private String physicalBonusAttr4;

    @Column(name = "magical_bonus_attr1")
    private String magicalBonusAttr1;

    @Column(name = "magical_bonus_attr2")
    private String magicalBonusAttr2;

    @Column(name = "magical_bonus_attr3")
    private String magicalBonusAttr3;

    @Column(name = "magical_bonus_attr4")
    private String magicalBonusAttr4;

    @Column(name = "icon_name")
    private String iconName;



    @Column(name = "growth_pt")
    private Integer growthPt;

    @Column(name = "max_growth_value")
    private Integer maxGrowthValue;

    @Column(name = "growth_cost")
    private Integer growthCost;

    @Column(name = "evolve_item")
    private String evolveItem;

    @Column(name = "evolve_item_num")
    private Integer evolveItemNum;

    @Column(name = "evolve_cost")
    private Integer evolveCost;

    private String fskill01;

    @Column(name = "usefskill01_energy")
    private String usefskill01Energy;

    private String fskill02;

    @Column(name = "usefskill02_energy")
    private String usefskill02Energy;

    @Column(name = "ui_star_grade")
    private Integer uiStarGrade;

    @Column(name = "can_authorize")
    private Boolean canAuthorize;

    @Column(name = "growth_point_from_pc_kill")
    private Integer growthPointFromPcKill;

    @Column(name = "skill_point_from_pc_kill")
    private Integer skillPointFromPcKill;

    @Column(name = "sub_group_set")
    private String subGroupSet;

    @Column(name = "authorize_grade")
    private Integer authorizeGrade;

    @Column(name = "fgroup_set")
    private String fgroupSet;

    @Column(name = "is_only_authorize_feed")
    private Boolean isOnlyAuthorizeFeed;

    @Column(name = "skill_point_rate_from_exp")
    private Integer skillPointRateFromExp;

    @Column(name = "skill_point_max")
    private Integer skillPointMax;

    @Column(name = "growth_point_rate_from_exp")
    private Integer growthPointRateFromExp;


    private String wing;

    @Column(name = "sub_physical_bonus_attr1")
    private String subPhysicalBonusAttr1;

    @Column(name = "sub_physical_bonus_attr3")
    private String subPhysicalBonusAttr3;

    @Column(name = "sub_physical_bonus_attr2")
    private String subPhysicalBonusAttr2;

    @Column(name = "sub_physical_bonus_attr4")
    private String subPhysicalBonusAttr4;

    @Column(name = "sub_magical_bonus_attr1")
    private String subMagicalBonusAttr1;

    @Column(name = "sub_magical_bonus_attr2")
    private String subMagicalBonusAttr2;

    @Column(name = "sub_magical_bonus_attr3")
    private String subMagicalBonusAttr3;

    @Column(name = "sub_magical_bonus_attr4")
    private String subMagicalBonusAttr4;

    @Column(name = "sub_equal_physical_bonus_attr1")
    private String subEqualPhysicalBonusAttr1;

    @Column(name = "sub_equal_physical_bonus_attr2")
    private String subEqualPhysicalBonusAttr2;

    @Column(name = "evolve_type")
    private Integer evolveType;

    @Column(name = "evolve_success_prob")
    private Integer evolveSuccessProb;

    @Column(name = "evolve_fail_add_prob")
    private Integer evolveFailAddProb;

    @Column(name = "physical_bonus_attr5")
    private String physicalBonusAttr5;

    @Column(name = "can_evolve")
    private Boolean canEvolve;

    @Column(name = "sub_equal_magical_bonus_attr1")
    private String subEqualMagicalBonusAttr1;

    @Column(name = "sub_equal_magical_bonus_attr2")
    private String subEqualMagicalBonusAttr2;

    @Column(name = "magical_bonus_attr5")
    private String magicalBonusAttr5;

    @Column(name = "sub_physical_bonus_attr5")
    private String subPhysicalBonusAttr5;

    @Column(name = "sub_magical_bonus_attr5")
    private String subMagicalBonusAttr5;

    @Column(name = "authorize_minion_num")
    private Integer authorizeMinionNum;

    @Column(name = "authorize_cost")
    private Integer authorizeCost;

    @Column(name = "sub_equal_physical_bonus_attr3")
    private String subEqualPhysicalBonusAttr3;

    @Column(name = "sub_equal_physical_bonus_attr4")
    private String subEqualPhysicalBonusAttr4;

    @Column(name = "sub_equal_physical_bonus_attr5")
    private String subEqualPhysicalBonusAttr5;

    @Column(name = "sub_equal_magical_bonus_attr4")
    private String subEqualMagicalBonusAttr4;

    @Column(name = "sub_equal_magical_bonus_attr5")
    private String subEqualMagicalBonusAttr5;

    @Column(name = "sub_equal_magical_bonus_attr3")
    private String subEqualMagicalBonusAttr3;

    @Column(name = "search_ko")
    private String ko;

    @Column(name = "search_us")
    private String us;

    @Column(name = "search_es")
    private String es;

    @Column(name = "search_pl")
    private String pl;

    @Column(name = "search_it")
    private String it;

    @Column(name = "search_fr")
    private String fr;

    @Column(name = "search_de")
    private String de;

    @Column(name = "search_en")
    private String en;


    public FamiliarEntity() {
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

    public String getDescStory() {
        return descStory;
    }

    public void setDescStory(String descStory) {
        this.descStory = descStory;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getMesh() {
        return mesh;
    }

    public void setMesh(String mesh) {
        this.mesh = mesh;
    }

    public String getTierGrade() {
        return tierGrade;
    }

    public void setTierGrade(String tierGrade) {
        this.tierGrade = tierGrade;
    }

    public Integer getStarGrade() {
        return starGrade;
    }

    public void setStarGrade(Integer starGrade) {
        this.starGrade = starGrade;
    }

    public Boolean getOnlyFeeds() {
        return isOnlyFeeds;
    }

    public void setOnlyFeeds(Boolean onlyFeeds) {
        isOnlyFeeds = onlyFeeds;
    }

    public Boolean getUseFuncOption() {
        return useFuncOption;
    }

    public void setUseFuncOption(Boolean useFuncOption) {
        this.useFuncOption = useFuncOption;
    }

    public String getPhysicalBonusAttr1() {
        return physicalBonusAttr1;
    }

    public void setPhysicalBonusAttr1(String physicalBonusAttr1) {
        this.physicalBonusAttr1 = physicalBonusAttr1;
    }

    public String getPhysicalBonusAttr2() {
        return physicalBonusAttr2;
    }

    public void setPhysicalBonusAttr2(String physicalBonusAttr2) {
        this.physicalBonusAttr2 = physicalBonusAttr2;
    }

    public String getPhysicalBonusAttr3() {
        return physicalBonusAttr3;
    }

    public void setPhysicalBonusAttr3(String physicalBonusAttr3) {
        this.physicalBonusAttr3 = physicalBonusAttr3;
    }

    public String getPhysicalBonusAttr4() {
        return physicalBonusAttr4;
    }

    public void setPhysicalBonusAttr4(String physicalBonusAttr4) {
        this.physicalBonusAttr4 = physicalBonusAttr4;
    }

    public String getMagicalBonusAttr1() {
        return magicalBonusAttr1;
    }

    public void setMagicalBonusAttr1(String magicalBonusAttr1) {
        this.magicalBonusAttr1 = magicalBonusAttr1;
    }

    public String getMagicalBonusAttr2() {
        return magicalBonusAttr2;
    }

    public void setMagicalBonusAttr2(String magicalBonusAttr2) {
        this.magicalBonusAttr2 = magicalBonusAttr2;
    }

    public String getMagicalBonusAttr3() {
        return magicalBonusAttr3;
    }

    public void setMagicalBonusAttr3(String magicalBonusAttr3) {
        this.magicalBonusAttr3 = magicalBonusAttr3;
    }

    public String getMagicalBonusAttr4() {
        return magicalBonusAttr4;
    }

    public void setMagicalBonusAttr4(String magicalBonusAttr4) {
        this.magicalBonusAttr4 = magicalBonusAttr4;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public Integer getGrowthPt() {
        return growthPt;
    }

    public void setGrowthPt(Integer growthPt) {
        this.growthPt = growthPt;
    }

    public Integer getMaxGrowthValue() {
        return maxGrowthValue;
    }

    public void setMaxGrowthValue(Integer maxGrowthValue) {
        this.maxGrowthValue = maxGrowthValue;
    }

    public Integer getGrowthCost() {
        return growthCost;
    }

    public void setGrowthCost(Integer growthCost) {
        this.growthCost = growthCost;
    }

    public String getEvolveItem() {
        return evolveItem;
    }

    public void setEvolveItem(String evolveItem) {
        this.evolveItem = evolveItem;
    }

    public Integer getEvolveItemNum() {
        return evolveItemNum;
    }

    public void setEvolveItemNum(Integer evolveItemNum) {
        this.evolveItemNum = evolveItemNum;
    }

    public Integer getEvolveCost() {
        return evolveCost;
    }

    public void setEvolveCost(Integer evolveCost) {
        this.evolveCost = evolveCost;
    }

    public String getFskill01() {
        return fskill01;
    }

    public void setFskill01(String fskill01) {
        this.fskill01 = fskill01;
    }

    public String getUsefskill01Energy() {
        return usefskill01Energy;
    }

    public void setUsefskill01Energy(String usefskill01Energy) {
        this.usefskill01Energy = usefskill01Energy;
    }

    public String getFskill02() {
        return fskill02;
    }

    public void setFskill02(String fskill02) {
        this.fskill02 = fskill02;
    }

    public String getUsefskill02Energy() {
        return usefskill02Energy;
    }

    public void setUsefskill02Energy(String usefskill02Energy) {
        this.usefskill02Energy = usefskill02Energy;
    }

    public Integer getUiStarGrade() {
        return uiStarGrade;
    }

    public void setUiStarGrade(Integer uiStarGrade) {
        this.uiStarGrade = uiStarGrade;
    }

    public Boolean getCanAuthorize() {
        return canAuthorize;
    }

    public void setCanAuthorize(Boolean canAuthorize) {
        this.canAuthorize = canAuthorize;
    }

    public Integer getGrowthPointFromPcKill() {
        return growthPointFromPcKill;
    }

    public void setGrowthPointFromPcKill(Integer growthPointFromPcKill) {
        this.growthPointFromPcKill = growthPointFromPcKill;
    }

    public Integer getSkillPointFromPcKill() {
        return skillPointFromPcKill;
    }

    public void setSkillPointFromPcKill(Integer skillPointFromPcKill) {
        this.skillPointFromPcKill = skillPointFromPcKill;
    }

    public String getSubGroupSet() {
        return subGroupSet;
    }

    public void setSubGroupSet(String subGroupSet) {
        this.subGroupSet = subGroupSet;
    }

    public Integer getAuthorizeGrade() {
        return authorizeGrade;
    }

    public void setAuthorizeGrade(Integer authorizeGrade) {
        this.authorizeGrade = authorizeGrade;
    }

    public String getFgroupSet() {
        return fgroupSet;
    }

    public void setFgroupSet(String fgroupSet) {
        this.fgroupSet = fgroupSet;
    }

    public Boolean getOnlyAuthorizeFeed() {
        return isOnlyAuthorizeFeed;
    }

    public void setOnlyAuthorizeFeed(Boolean onlyAuthorizeFeed) {
        isOnlyAuthorizeFeed = onlyAuthorizeFeed;
    }

    public Integer getSkillPointRateFromExp() {
        return skillPointRateFromExp;
    }

    public void setSkillPointRateFromExp(Integer skillPointRateFromExp) {
        this.skillPointRateFromExp = skillPointRateFromExp;
    }

    public Integer getSkillPointMax() {
        return skillPointMax;
    }

    public void setSkillPointMax(Integer skillPointMax) {
        this.skillPointMax = skillPointMax;
    }

    public Integer getGrowthPointRateFromExp() {
        return growthPointRateFromExp;
    }

    public void setGrowthPointRateFromExp(Integer growthPointRateFromExp) {
        this.growthPointRateFromExp = growthPointRateFromExp;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }

    public String getSubPhysicalBonusAttr1() {
        return subPhysicalBonusAttr1;
    }

    public void setSubPhysicalBonusAttr1(String subPhysicalBonusAttr1) {
        this.subPhysicalBonusAttr1 = subPhysicalBonusAttr1;
    }

    public String getSubPhysicalBonusAttr3() {
        return subPhysicalBonusAttr3;
    }

    public void setSubPhysicalBonusAttr3(String subPhysicalBonusAttr3) {
        this.subPhysicalBonusAttr3 = subPhysicalBonusAttr3;
    }

    public String getSubPhysicalBonusAttr2() {
        return subPhysicalBonusAttr2;
    }

    public void setSubPhysicalBonusAttr2(String subPhysicalBonusAttr2) {
        this.subPhysicalBonusAttr2 = subPhysicalBonusAttr2;
    }

    public String getSubPhysicalBonusAttr4() {
        return subPhysicalBonusAttr4;
    }

    public void setSubPhysicalBonusAttr4(String subPhysicalBonusAttr4) {
        this.subPhysicalBonusAttr4 = subPhysicalBonusAttr4;
    }

    public String getSubMagicalBonusAttr1() {
        return subMagicalBonusAttr1;
    }

    public void setSubMagicalBonusAttr1(String subMagicalBonusAttr1) {
        this.subMagicalBonusAttr1 = subMagicalBonusAttr1;
    }

    public String getSubMagicalBonusAttr2() {
        return subMagicalBonusAttr2;
    }

    public void setSubMagicalBonusAttr2(String subMagicalBonusAttr2) {
        this.subMagicalBonusAttr2 = subMagicalBonusAttr2;
    }

    public String getSubMagicalBonusAttr3() {
        return subMagicalBonusAttr3;
    }

    public void setSubMagicalBonusAttr3(String subMagicalBonusAttr3) {
        this.subMagicalBonusAttr3 = subMagicalBonusAttr3;
    }

    public String getSubMagicalBonusAttr4() {
        return subMagicalBonusAttr4;
    }

    public void setSubMagicalBonusAttr4(String subMagicalBonusAttr4) {
        this.subMagicalBonusAttr4 = subMagicalBonusAttr4;
    }

    public String getSubEqualPhysicalBonusAttr1() {
        return subEqualPhysicalBonusAttr1;
    }

    public void setSubEqualPhysicalBonusAttr1(String subEqualPhysicalBonusAttr1) {
        this.subEqualPhysicalBonusAttr1 = subEqualPhysicalBonusAttr1;
    }

    public String getSubEqualPhysicalBonusAttr2() {
        return subEqualPhysicalBonusAttr2;
    }

    public void setSubEqualPhysicalBonusAttr2(String subEqualPhysicalBonusAttr2) {
        this.subEqualPhysicalBonusAttr2 = subEqualPhysicalBonusAttr2;
    }

    public Integer getEvolveType() {
        return evolveType;
    }

    public void setEvolveType(Integer evolveType) {
        this.evolveType = evolveType;
    }

    public Integer getEvolveSuccessProb() {
        return evolveSuccessProb;
    }

    public void setEvolveSuccessProb(Integer evolveSuccessProb) {
        this.evolveSuccessProb = evolveSuccessProb;
    }

    public Integer getEvolveFailAddProb() {
        return evolveFailAddProb;
    }

    public void setEvolveFailAddProb(Integer evolveFailAddProb) {
        this.evolveFailAddProb = evolveFailAddProb;
    }

    public String getPhysicalBonusAttr5() {
        return physicalBonusAttr5;
    }

    public void setPhysicalBonusAttr5(String physicalBonusAttr5) {
        this.physicalBonusAttr5 = physicalBonusAttr5;
    }

    public Boolean getCanEvolve() {
        return canEvolve;
    }

    public void setCanEvolve(Boolean canEvolve) {
        this.canEvolve = canEvolve;
    }

    public String getSubEqualMagicalBonusAttr1() {
        return subEqualMagicalBonusAttr1;
    }

    public void setSubEqualMagicalBonusAttr1(String subEqualMagicalBonusAttr1) {
        this.subEqualMagicalBonusAttr1 = subEqualMagicalBonusAttr1;
    }

    public String getSubEqualMagicalBonusAttr2() {
        return subEqualMagicalBonusAttr2;
    }

    public void setSubEqualMagicalBonusAttr2(String subEqualMagicalBonusAttr2) {
        this.subEqualMagicalBonusAttr2 = subEqualMagicalBonusAttr2;
    }

    public String getMagicalBonusAttr5() {
        return magicalBonusAttr5;
    }

    public void setMagicalBonusAttr5(String magicalBonusAttr5) {
        this.magicalBonusAttr5 = magicalBonusAttr5;
    }

    public String getSubPhysicalBonusAttr5() {
        return subPhysicalBonusAttr5;
    }

    public void setSubPhysicalBonusAttr5(String subPhysicalBonusAttr5) {
        this.subPhysicalBonusAttr5 = subPhysicalBonusAttr5;
    }

    public String getSubMagicalBonusAttr5() {
        return subMagicalBonusAttr5;
    }

    public void setSubMagicalBonusAttr5(String subMagicalBonusAttr5) {
        this.subMagicalBonusAttr5 = subMagicalBonusAttr5;
    }

    public Integer getAuthorizeMinionNum() {
        return authorizeMinionNum;
    }

    public void setAuthorizeMinionNum(Integer authorizeMinionNum) {
        this.authorizeMinionNum = authorizeMinionNum;
    }

    public Integer getAuthorizeCost() {
        return authorizeCost;
    }

    public void setAuthorizeCost(Integer authorizeCost) {
        this.authorizeCost = authorizeCost;
    }

    public String getSubEqualPhysicalBonusAttr3() {
        return subEqualPhysicalBonusAttr3;
    }

    public void setSubEqualPhysicalBonusAttr3(String subEqualPhysicalBonusAttr3) {
        this.subEqualPhysicalBonusAttr3 = subEqualPhysicalBonusAttr3;
    }

    public String getSubEqualPhysicalBonusAttr4() {
        return subEqualPhysicalBonusAttr4;
    }

    public void setSubEqualPhysicalBonusAttr4(String subEqualPhysicalBonusAttr4) {
        this.subEqualPhysicalBonusAttr4 = subEqualPhysicalBonusAttr4;
    }

    public String getSubEqualPhysicalBonusAttr5() {
        return subEqualPhysicalBonusAttr5;
    }

    public void setSubEqualPhysicalBonusAttr5(String subEqualPhysicalBonusAttr5) {
        this.subEqualPhysicalBonusAttr5 = subEqualPhysicalBonusAttr5;
    }

    public String getSubEqualMagicalBonusAttr4() {
        return subEqualMagicalBonusAttr4;
    }

    public void setSubEqualMagicalBonusAttr4(String subEqualMagicalBonusAttr4) {
        this.subEqualMagicalBonusAttr4 = subEqualMagicalBonusAttr4;
    }

    public String getSubEqualMagicalBonusAttr5() {
        return subEqualMagicalBonusAttr5;
    }

    public void setSubEqualMagicalBonusAttr5(String subEqualMagicalBonusAttr5) {
        this.subEqualMagicalBonusAttr5 = subEqualMagicalBonusAttr5;
    }

    public String getSubEqualMagicalBonusAttr3() {
        return subEqualMagicalBonusAttr3;
    }

    public void setSubEqualMagicalBonusAttr3(String subEqualMagicalBonusAttr3) {
        this.subEqualMagicalBonusAttr3 = subEqualMagicalBonusAttr3;
    }

    public String getKo() {
        return ko;
    }

    public void setKo(String ko) {
        this.ko = ko;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}
