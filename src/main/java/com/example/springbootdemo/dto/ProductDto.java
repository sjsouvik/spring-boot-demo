package com.example.springbootdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class ProductDto {
  @Id // this would make the property as primary key
  @GeneratedValue(strategy = GenerationType.AUTO) // this would auto generate the IDs
  @JsonProperty("id")
  // this would help to hide the actual defined property of the model/entity, instead it would send the given value passed to the annotation(in this example, it would send "id" instead of the actual property "productId")
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
