package com.example.transferencias.DTO;

import com.example.transferencias.cliente.Cliente;

public record DadosListagemCliente(String nome) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getNome());
    }
}
