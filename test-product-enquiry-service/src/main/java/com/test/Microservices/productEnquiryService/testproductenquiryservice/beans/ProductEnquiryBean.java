package com.test.Microservices.productEnquiryService.testproductenquiryservice.beans;

import java.math.BigDecimal;

public class ProductEnquiryBean {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private Double discountOffer;

    private int unit;
    private double totalPrice;

    private int port;

    public ProductEnquiryBean(Long id, String productName, BigDecimal productPrice, String productAvailability, Double discountOffer, int unit, double totalPrice, int port) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailability = productAvailability;
        this.discountOffer = discountOffer;
        this.unit = unit;
        this.totalPrice = totalPrice;
        this.port = port;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductAvailability() {
        return productAvailability;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;
    }

    public Double getDiscountOffer() {
        return discountOffer;
    }

    public void setDiscountOffer(Double discountOffer) {
        this.discountOffer = discountOffer;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ProductEnquiryBean{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productAvailability='" + productAvailability + '\'' +
                ", discountOffer=" + discountOffer +
                ", unit=" + unit +
                ", totalPrice=" + totalPrice +
                ", port=" + port +
                '}';
    }
}
