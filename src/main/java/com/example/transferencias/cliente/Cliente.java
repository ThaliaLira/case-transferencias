package com.example.transferencias.cliente;


import com.example.transferencias.DTO.DadosCadastroCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String numero_da_conta;
    private String saldo_da_conta;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.numero_da_conta = dados.numero_da_conta();
        this.saldo_da_conta = dados.saldo_da_conta();
    }

}
