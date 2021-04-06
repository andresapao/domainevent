package com.estudos.entities.pedido;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;

@Embeddable
public class PedidoID implements Serializable  {
    UUID id;
}
