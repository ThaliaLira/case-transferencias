package com.example.transferencias.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(

        @NotBlank
        String nome,

        @NotBlank
        @Pattern(regexp = "\\d{5}")
        String numero_da_conta,

        String saldo_da_conta) {
}
