package com.example.springbootdemo.model;

public class ProductModel {

  private int productId;
  private String title;
  private int price;

  public String getTitle() {
    return title;
  }

  public int getProductId() {
    return productId;
  }

  public void setProductId(int productId) {
    this.productId = productId;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
