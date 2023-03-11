package com.example.springbootdemo.service;

import com.example.springbootdemo.model.ProductModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private int productIdCount = 1;
  private List<ProductModel> productsList = new ArrayList<>();

  public ProductModel addProduct(ProductModel product) {
    product.setProductId(productIdCount++);
    productsList.add(product);
    return product;
  }

  public List<ProductModel> getAllProducts() {
    return productsList;
  }

  public ProductModel getProduct(int productId) {
    return productsList.stream().filter(product -> product.getProductId() == productId).findFirst().get();
  }

  public ProductModel updateProduct(int productId, ProductModel product) {
    productsList.stream().forEach(p -> {
      if (p.getProductId() == productId) {
        p.setTitle(product.getTitle());
        p.setPrice(product.getPrice());
      }
    });

    return productsList.stream().filter(p -> p.getProductId() == productId).findFirst().get();
  }

  public void deleteProduct(int productId) {
    productsList.stream().forEach(product -> {
      if (product.getProductId() == productId) {
        productsList.remove(product);
      }
    });
  }
}
