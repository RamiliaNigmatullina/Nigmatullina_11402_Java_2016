package ru.kpfu.itis.entity;

import javax.persistence.*;

/**
 * Created by ramilanigmatullina on 18.04.16.
 */
@Entity
@Table(name = "plinths")
public class Plinth {
    private Integer id;
    private Integer articleNumber;
    private String description;
    private String keyFeatures;
    private Integer price;
    private String priceFor;
    private boolean inStock;
    private String width;
    private String height;
    private String thickness;

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
    @Column(name = "thickness")
    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plinth plinth = (Plinth) o;

        if (inStock != plinth.inStock) return false;
        if (id != null ? !id.equals(plinth.id) : plinth.id != null) return false;
        if (articleNumber != null ? !articleNumber.equals(plinth.articleNumber) : plinth.articleNumber != null)
            return false;
        if (description != null ? !description.equals(plinth.description) : plinth.description != null) return false;
        if (keyFeatures != null ? !keyFeatures.equals(plinth.keyFeatures) : plinth.keyFeatures != null) return false;
        if (price != null ? !price.equals(plinth.price) : plinth.price != null) return false;
        if (priceFor != null ? !priceFor.equals(plinth.priceFor) : plinth.priceFor != null) return false;
        if (width != null ? !width.equals(plinth.width) : plinth.width != null) return false;
        if (height != null ? !height.equals(plinth.height) : plinth.height != null) return false;
        return thickness != null ? thickness.equals(plinth.thickness) : plinth.thickness == null;

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
        result = 31 * result + (thickness != null ? thickness.hashCode() : 0);
        return result;
    }
}
