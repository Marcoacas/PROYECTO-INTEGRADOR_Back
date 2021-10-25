package com.marcoacas.demoMarco1.services;
import com.marcoacas.demoMarco1.models.Client;
import java.util.List;

public interface ClientService {

    List<Client> getAll();

    Client registerClient(Client cliente);

    Client logInClient(String user, String password);


}
