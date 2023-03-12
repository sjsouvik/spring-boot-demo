package com.example.springbootdemo.service;

import com.example.springbootdemo.Exception.ProductNotFoundException;
import com.example.springbootdemo.model.ProductModel;
import com.example.springbootdemo.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public ProductModel addProduct(ProductModel product) {
    return productRepository.save(product);
  }

  public List<ProductModel> getAllProducts() {
    return productRepository.findAll();
  }

  public ProductModel getProduct(int productId) {
    Optional<ProductModel> productModel = productRepository.findById(productId);

    if (!productModel.isPresent()) {
      throw new ProductNotFoundException("Oops! this product is not available!");
    }

    return productModel.get();
  }

  public ProductModel updateProduct(int productId, ProductModel product) {
    product.setProductId(productId); // we've to set the id of record as the product doesn't contain product id and product id is required to update the record
    // save could be used to add or update record, if we have the id of the record as a parameter, then save() would update the record, else it'll create a new record
    return productRepository.save(product);
  }

  public void deleteProduct(int productId) {
    productRepository.deleteById(productId);
  }

}
