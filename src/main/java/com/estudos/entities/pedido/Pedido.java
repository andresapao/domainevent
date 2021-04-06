package com.estudos.entities.pedido;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Pedido {
	@EmbeddedId
    PedidoID id;

    String nomeDestinario;
    Date dataPedido;
    Integer quantidadeItens;
}
