package com.example.springbootdemo.Exception;

public class ProductNotFoundException extends RuntimeException {

  public ProductNotFoundException(String errorMessage) {
    super(errorMessage);
  }

}
