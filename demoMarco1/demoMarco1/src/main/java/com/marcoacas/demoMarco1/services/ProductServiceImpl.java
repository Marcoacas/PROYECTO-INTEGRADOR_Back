package com.marcoacas.demoMarco1.services;

import com.marcoacas.demoMarco1.models.Product;
import com.marcoacas.demoMarco1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

//Esta clase implementa los servicios
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired//Para inyectar objetos sin escribir toda su estructura
    private ProductRepository productRepository;

    @Override //Sobreescribiendo el metodo de la interfaz, le decimos que haga lo que se sobreescribe
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

}
