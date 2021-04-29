package com.estudos.entities.pedido;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@Getter
public class Pedido {
    @Id
    PedidoID pedidoId;
    String nomeDestinario;
    LocalDate dataPedido;
    Integer quantidadeItens;

    @Builder
    private Pedido(@NonNull String nomeDestinario) {

            this.dataPedido = LocalDate.now();
            this.nomeDestinario = nomeDestinario;
            this.pedidoId = PedidoID.novo();
            this.quantidadeItens = 0;
    }
    public void incrementaQuantidade(Integer quantidade)
    {
        this.quantidadeItens += quantidade;
    }
}
