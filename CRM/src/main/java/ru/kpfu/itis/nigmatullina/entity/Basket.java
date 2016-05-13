package ru.kpfu.itis.nigmatullina.entity;

import javax.persistence.*;

/**
 * Created by ramilanigmatullina on 10.05.16.
 */
@Entity
@Table(name = "baskets")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User userId;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @ManyToOne(targetEntity = BaseCabinet.class)
    @JoinColumn(name = "base_cabinet_id", referencedColumnName = "id")
    private BaseCabinet baseCabinetId;

    @ManyToOne(targetEntity = CabinetForBuiltInAppliances.class)
    @JoinColumn(name = "cabinet_for_built_in_appliances_id", referencedColumnName = "id")
    private CabinetForBuiltInAppliances cabinetForBuiltInAppliancesId;

    @ManyToOne(targetEntity = Door.class)
    @JoinColumn(name = "door_id", referencedColumnName = "id")
    private Door doorId;

    @ManyToOne(targetEntity = DrawerFront.class)
    @JoinColumn(name = "drawer_front_id", referencedColumnName = "id")
    private DrawerFront drawerFrontId;

    @ManyToOne(targetEntity = HighCabinet.class)
    @JoinColumn(name = "high_cabinet_id", referencedColumnName = "id")
    private HighCabinet highCabinetId;

    @ManyToOne(targetEntity = DrawerFront.class)
    @JoinColumn(name = "leg_id", referencedColumnName = "id")
    private Leg legId;

    @ManyToOne(targetEntity = WallCabinet.class)
    @JoinColumn(name = "wall_cabinet_id", referencedColumnName = "id")
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
