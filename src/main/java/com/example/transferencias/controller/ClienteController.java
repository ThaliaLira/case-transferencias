package com.example.transferencias.controller;

import com.example.transferencias.cliente.Cliente;
import com.example.transferencias.cliente.ClienteRepository;
import com.example.transferencias.cliente.DadosCadastroCliente;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("cliente")

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @NotNull DadosCadastroCliente dados) {
        clienteRepository.save(new Cliente(null, dados.nome(), dados.numeroDaConta(), dados.saldoDaConta()));

    }



}
