package com.marcoacas.demoMarco1.controllers;


import com.marcoacas.demoMarco1.models.Client;
import com.marcoacas.demoMarco1.models.Product;
import com.marcoacas.demoMarco1.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class ClientsController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll(){
        return clientService.getAll();
    }

}
