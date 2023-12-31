package com.lsz.persistence.product;

import java.io.Serializable;

public class ProductInfoDO implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.product_name
     *
     * @mbg.generated
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.picture_url
     *
     * @mbg.generated
     */
    private String pictureUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.product_price_amt
     *
     * @mbg.generated
     */
    private Long productPriceAmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.ccy
     *
     * @mbg.generated
     */
    private String ccy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column spike_product.tag
     *
     * @mbg.generated
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table spike_product
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.id
     *
     * @return the value of spike_product.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.id
     *
     * @param id the value for spike_product.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.product_id
     *
     * @return the value of spike_product.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.product_id
     *
     * @param productId the value for spike_product.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.product_name
     *
     * @return the value of spike_product.product_name
     *
     * @mbg.generated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.product_name
     *
     * @param productName the value for spike_product.product_name
     *
     * @mbg.generated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.picture_url
     *
     * @return the value of spike_product.picture_url
     *
     * @mbg.generated
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.picture_url
     *
     * @param pictureUrl the value for spike_product.picture_url
     *
     * @mbg.generated
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.product_price_amt
     *
     * @return the value of spike_product.product_price_amt
     *
     * @mbg.generated
     */
    public Long getProductPriceAmt() {
        return productPriceAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.product_price_amt
     *
     * @param productPriceAmt the value for spike_product.product_price_amt
     *
     * @mbg.generated
     */
    public void setProductPriceAmt(Long productPriceAmt) {
        this.productPriceAmt = productPriceAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.ccy
     *
     * @return the value of spike_product.ccy
     *
     * @mbg.generated
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.ccy
     *
     * @param ccy the value for spike_product.ccy
     *
     * @mbg.generated
     */
    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column spike_product.tag
     *
     * @return the value of spike_product.tag
     *
     * @mbg.generated
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column spike_product.tag
     *
     * @param tag the value for spike_product.tag
     *
     * @mbg.generated
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_product
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProductInfoDO other = (ProductInfoDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getPictureUrl() == null ? other.getPictureUrl() == null : this.getPictureUrl().equals(other.getPictureUrl()))
            && (this.getProductPriceAmt() == null ? other.getProductPriceAmt() == null : this.getProductPriceAmt().equals(other.getProductPriceAmt()))
            && (this.getCcy() == null ? other.getCcy() == null : this.getCcy().equals(other.getCcy()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_product
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getPictureUrl() == null) ? 0 : getPictureUrl().hashCode());
        result = prime * result + ((getProductPriceAmt() == null) ? 0 : getProductPriceAmt().hashCode());
        result = prime * result + ((getCcy() == null) ? 0 : getCcy().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spike_product
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", productPriceAmt=").append(productPriceAmt);
        sb.append(", ccy=").append(ccy);
        sb.append(", tag=").append(tag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}