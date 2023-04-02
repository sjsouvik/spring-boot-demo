package com.example.springbootdemo.controller;

import com.example.springbootdemo.dto.ProductDto;
import com.example.springbootdemo.mapper.ProductMapper;
import com.example.springbootdemo.model.ProductModel;
import com.example.springbootdemo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

  @Autowired // to get Autowired work we need to annotate the service class with @Component or, @Service
  private ProductService productService;

  @PostMapping
  public ResponseEntity<ProductDto> addProduct(@RequestBody ProductModel product) {
    return ResponseEntity.ok(ProductMapper.instance.productModelToDto(productService.addProduct(product)));
  }

  @GetMapping
  public List<ProductModel> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping(value = "/{productId}")
  public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") int productId) {
    return ResponseEntity.ok(ProductMapper.instance.productModelToDto(productService.getProduct(productId)));
  }

  @PutMapping(value = "/{productId}")
  public ResponseEntity<ProductDto> updateProduct(@PathVariable("productId") int productId, @RequestBody ProductModel product) {
    return ResponseEntity.ok(ProductMapper.instance.productModelToDto(productService.updateProduct(productId, product)));
  }

  @DeleteMapping(value = "/{productId}")
  public void deleteProduct(@PathVariable("productId") int productId) {
    productService.deleteProduct(productId);
  }

}
