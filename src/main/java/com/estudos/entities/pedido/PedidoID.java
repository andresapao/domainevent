package com.estudos.entities.pedido;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Embeddable
@NoArgsConstructor
public class PedidoID implements Serializable  {
    private UUID id;
    public PedidoID(UUID id)
    {
        this.id = id;
    }
    public static PedidoID novo() {
        return new PedidoID(UUID.randomUUID());
    }

    public static PedidoID from(UUID uuid) {
        return new PedidoID(uuid);
    }

}
