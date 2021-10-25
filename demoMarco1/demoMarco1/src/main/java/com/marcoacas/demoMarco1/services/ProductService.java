package com.marcoacas.demoMarco1.services;

import com.marcoacas.demoMarco1.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    List<Product> getAll();

    Product create(Product product);

}
