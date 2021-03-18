package com.main.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description:订单dto，除了包含order表字段，还包含客户表某些字段，用于订单页面显示
 * @author:jgc
 * @create:2021-03-17 14:09
 */
public class FOrderDTO {
    private int orderId;
    private String customerId;
    private Date orderTime;
    private String furniture;
    private BigDecimal totalAmount;
    private BigDecimal frontMoney;
    private Date payTime;
    private Date deliverTime;
    private String state;
    private Date createTime;

    private String name;
    private String mobile1;
    private String mobile2;
    private String address;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getFurniture() {
        return furniture;
    }

    public void setFurniture(String furniture) {
        this.furniture = furniture;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getFrontMoney() {
        return frontMoney;
    }

    public void setFrontMoney(BigDecimal frontMoney) {
        this.frontMoney = frontMoney;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }

    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FOrderDTO{" +
                "orderId=" + orderId +
                ", customerId='" + customerId + '\'' +
                ", orderTime=" + orderTime +
                ", furniture='" + furniture + '\'' +
                ", totalAmount=" + totalAmount +
                ", frontMoney=" + frontMoney +
                ", payTime=" + payTime +
                ", deliverTime=" + deliverTime +
                ", state='" + state + '\'' +
                ", createTime=" + createTime +
                ", name='" + name + '\'' +
                ", mobile1='" + mobile1 + '\'' +
                ", mobile2='" + mobile2 + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
