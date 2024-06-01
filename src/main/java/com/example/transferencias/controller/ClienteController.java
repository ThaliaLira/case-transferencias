package com.example.transferencias.controller;

import com.example.transferencias.cliente.Cliente;
import com.example.transferencias.repository.ClienteRepository;
import com.example.transferencias.DTO.DadosCadastroCliente;
import com.example.transferencias.DTO.DadosListagemCliente;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("cliente")

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @Transactional
    public Cliente cadastro(@RequestBody @Valid DadosCadastroCliente dados) {
       return clienteRepository.save(new Cliente(dados));

    }
    @GetMapping
    public List<DadosListagemCliente> listar(){
        return clienteRepository.findAll().stream().map(DadosListagemCliente::new).toList();

    }



}
