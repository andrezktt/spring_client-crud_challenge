package com.andrezktt.client_crud.controllers;

import com.andrezktt.client_crud.entities.Client;
import com.andrezktt.client_crud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<Page<Client>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }
}
