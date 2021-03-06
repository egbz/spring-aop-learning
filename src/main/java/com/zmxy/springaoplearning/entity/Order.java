package com.zmxy.springaoplearning.entity;

/**
 * @author will
 * @date 2020/11/20
 */
public class Order {
    private String userName;
    private String product;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userName='" + userName + '\'' +
                ", product='" + product + '\'' +
                '}';
    }
}
