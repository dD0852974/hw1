package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sql2o.Connection;

import java.util.List;

@Service
public class productService {

  @Autowired
  private com.example.demo.database.sql2oDbHandler sql2oDbHandler;

  public productService() {

  }

  public List<Product> getProducts() {
    try (Connection connection = sql2oDbHandler.getConnector().open()) {
      String query = "select ID id, NAME name, IMAGE_URL imageUrl, PRICE price, DESCRIPTION description"
          + " from PRODUCT";

      return connection.createQuery(query)
          .addParameter(name :"keyword" keyword)
          .executeAndFetch(Product.class);
    }
  }

}