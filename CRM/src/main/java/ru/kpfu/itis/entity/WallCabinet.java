package ru.kpfu.itis.entity;

import javax.persistence.*;

/**
 * Created by ramilanigmatullina on 18.04.16.
 */
@Entity
@Table(name = "wall_cabinets")
public class WallCabinet {
    private Integer id;
    private Integer articleNumber;
    private String description;
    private String keyFeatures;
    private Integer price;
    private String priceFor;
    private boolean inStock;
    private String width;
    private String height;
    private String depth;

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
    @Column(name = "width")
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    @Basic
    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "depth")
    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WallCabinet that = (WallCabinet) o;

        if (inStock != that.inStock) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (articleNumber != null ? !articleNumber.equals(that.articleNumber) : that.articleNumber != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (keyFeatures != null ? !keyFeatures.equals(that.keyFeatures) : that.keyFeatures != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (priceFor != null ? !priceFor.equals(that.priceFor) : that.priceFor != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        return depth != null ? depth.equals(that.depth) : that.depth == null;

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
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (depth != null ? depth.hashCode() : 0);
        return result;
    }
}
