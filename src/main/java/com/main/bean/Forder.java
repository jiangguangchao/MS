package com.main.bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description:家具订单
 * @author:jgc
 * @create:2021-03-16 09:26
 */
public class Forder {

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

    @Override
    public String toString() {
        return "Forder{" +
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
                '}';
    }
}
