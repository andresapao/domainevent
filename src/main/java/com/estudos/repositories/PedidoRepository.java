package com.estudos.repositories;

import java.util.UUID;

import com.estudos.entities.pedido.PedidoID;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.entities.pedido.Pedido;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, UUID> {
    Pedido findByPedidoId(PedidoID id);
}
