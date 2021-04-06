package com.estudos.entities.pedido;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
public class ItemPedido {
    @Id
    @GeneratedValue
    UUID itemId;
    PedidoID pedido;
    String nomeProduto;
    Integer quantidade;
}
