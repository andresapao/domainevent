package com.estudos.infra.model;

import com.estudos.entities.pedido.PedidoID;
import lombok.Getter;

import javax.persistence.GeneratedValue;

@Getter
public final class ItemPedidoAdicionado extends SimpleEvent{
    private final int quantidade;
    private final PedidoID pedidoID;
    public ItemPedidoAdicionado(int quantidade, PedidoID pedidoID) {
        super();
        this.quantidade = quantidade;
        this.pedidoID = pedidoID;
    }

}