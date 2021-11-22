package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.productService;
import java.util.List;
import  org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;

/**
 * Used to execute this program.

 */
@RestController
public class productController {
  @Autowired
  productService productManager;

  @GetMapping("/products")
  public List<Product> getProducts() {
    return  productManager.getProducts();
  }
  @GetMapping("/keyword")
  public List<Product> getProducts(@RequestParam String keyword) {
    return productManager.getProducts(keyword);
  }

}
