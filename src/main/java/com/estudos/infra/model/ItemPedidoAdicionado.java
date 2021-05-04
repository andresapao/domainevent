package com.estudos.infra.model;

public final class ItemPedidoAdcionado extends SimpleEvent{
    private final int quantidade;
    public ItemPedidoAdcionado(int quantidade) {
        super();
        this.quantidade = quantidade;
    }

}