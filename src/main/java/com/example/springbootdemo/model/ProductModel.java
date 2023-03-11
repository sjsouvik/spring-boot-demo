package com.example.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductModel {

  @JsonProperty("id")
  private int productId;
  @JsonProperty("name")
  private String title;
  @JsonProperty("price")
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
