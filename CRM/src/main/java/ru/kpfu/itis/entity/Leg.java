package ru.kpfu.itis.entity;

import javax.persistence.*;

/**
 * Created by ramilanigmatullina on 18.04.16.
 */
@Entity
@Table(name = "legs")
public class Leg {
    private Integer id;
    private Integer articleNumber;
    private String description;
    private String keyFeatures;
    private Integer price;
    private String priceFor;
    private boolean inStock;
    private String maxLoadLeg;
    private String minHeight;
    private String maxHeight;
    private String packageQuantity;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "article_number")
    public Integer getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(Integer articleNumber) {
        this.articleNumber = articleNumber;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "key_features")
    public String getKeyFeatures() {
        return keyFeatures;
    }

    public void setKeyFeatures(String keyFeatures) {
        this.keyFeatures = keyFeatures;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "price_for")
    public String getPriceFor() {
        return priceFor;
    }

    public void setPriceFor(String priceFor) {
        this.priceFor = priceFor;
    }

    @Basic
    @Column(name = "in_stock")
    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    @Basic
    @Column(name = "max_load/leg")
    public String getMaxLoadLeg() {
        return maxLoadLeg;
    }

    public void setMaxLoadLeg(String maxLoadLeg) {
        this.maxLoadLeg = maxLoadLeg;
    }

    @Basic
    @Column(name = "min_height")
    public String getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(String minHeight) {
        this.minHeight = minHeight;
    }

    @Basic
    @Column(name = "max_height")
    public String getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(String maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Basic
    @Column(name = "package_quantity")
    public String getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(String packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Leg leg = (Leg) o;

        if (inStock != leg.inStock) return false;
        if (id != null ? !id.equals(leg.id) : leg.id != null) return false;
        if (articleNumber != null ? !articleNumber.equals(leg.articleNumber) : leg.articleNumber != null)
            return false;
        if (description != null ? !description.equals(leg.description) : leg.description != null) return false;
        if (keyFeatures != null ? !keyFeatures.equals(leg.keyFeatures) : leg.keyFeatures != null) return false;
        if (price != null ? !price.equals(leg.price) : leg.price != null) return false;
        if (priceFor != null ? !priceFor.equals(leg.priceFor) : leg.priceFor != null) return false;
        if (maxLoadLeg != null ? !maxLoadLeg.equals(leg.maxLoadLeg) : leg.maxLoadLeg != null) return false;
        if (minHeight != null ? !minHeight.equals(leg.minHeight) : leg.minHeight != null) return false;
        if (maxHeight != null ? !maxHeight.equals(leg.maxHeight) : leg.maxHeight != null) return false;
        return packageQuantity != null ? packageQuantity.equals(leg.packageQuantity) : leg.packageQuantity == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (articleNumber != null ? articleNumber.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (keyFeatures != null ? keyFeatures.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (priceFor != null ? priceFor.hashCode() : 0);
        result = 31 * result + (inStock ? 1 : 0);
        result = 31 * result + (maxLoadLeg != null ? maxLoadLeg.hashCode() : 0);
        result = 31 * result + (minHeight != null ? minHeight.hashCode() : 0);
        result = 31 * result + (maxHeight != null ? maxHeight.hashCode() : 0);
        result = 31 * result + (packageQuantity != null ? packageQuantity.hashCode() : 0);
        return result;
    }
}
