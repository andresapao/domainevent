package com.estudos.entities.pedido;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table
@Getter
public class ItemPedido {
    @Id
    @GeneratedValue
    UUID itemId;
    PedidoID pedidoId;
    String nomeProduto;
    Integer quantidade;

    @Builder
    private ItemPedido(@NonNull PedidoID pedidoId, @NonNull String nomeProduto, Integer quantidade) {

        this.pedidoId = pedidoId;
        this.quantidade = Objects.isNull(quantidade) ? 0 : quantidade; //TODO: como tratar nulo ou zero?
        this.nomeProduto = nomeProduto;

    }
}
