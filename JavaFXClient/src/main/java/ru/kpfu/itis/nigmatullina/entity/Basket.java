package ru.kpfu.itis.nigmatullina.entity;

/**
 * Created by ramilanigmatullina on 10.05.16.
 */
public class Basket {
    private Integer id;
    private User userId;
    private Integer amount;
    private BaseCabinet baseCabinetId;
    private CabinetForBuiltInAppliances cabinetForBuiltInAppliancesId;
    private Door doorId;
    private DrawerFront drawerFrontId;
    private HighCabinet highCabinetId;
    private Leg legId;
    private WallCabinet wallCabinetId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BaseCabinet getBaseCabinetId() {
        return baseCabinetId;
    }

    public void setBaseCabinetId(BaseCabinet baseCabinetId) {
        this.baseCabinetId = baseCabinetId;
    }

    public CabinetForBuiltInAppliances getCabinetForBuiltInAppliancesId() {
        return cabinetForBuiltInAppliancesId;
    }

    public void setCabinetForBuiltInAppliancesId(CabinetForBuiltInAppliances cabinetForBuiltInAppliancesId) {
        this.cabinetForBuiltInAppliancesId = cabinetForBuiltInAppliancesId;
    }

    public Door getDoorId() {
        return doorId;
    }

    public void setDoorId(Door doorId) {
        this.doorId = doorId;
    }

    public DrawerFront getDrawerFrontId() {
        return drawerFrontId;
    }

    public void setDrawerFrontId(DrawerFront drawerFrontId) {
        this.drawerFrontId = drawerFrontId;
    }

    public HighCabinet getHighCabinetId() {
        return highCabinetId;
    }

    public void setHighCabinetId(HighCabinet highCabinetId) {
        this.highCabinetId = highCabinetId;
    }

    public Leg getLegId() {
        return legId;
    }

    public void setLegId(Leg legId) {
        this.legId = legId;
    }

    public WallCabinet getWallCabinetId() {
        return wallCabinetId;
    }

    public void setWallCabinetId(WallCabinet wallCabinetId) {
        this.wallCabinetId = wallCabinetId;
    }
}
