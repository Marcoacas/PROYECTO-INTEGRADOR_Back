package com.marcoacas.demoMarco1.services;
import com.marcoacas.demoMarco1.models.Client;
import com.marcoacas.demoMarco1.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client logInClient(String user, String password) {
        return null;
    }

    @Override
    public Client registerClient(Client cliente) {
        return null;
    }
}
