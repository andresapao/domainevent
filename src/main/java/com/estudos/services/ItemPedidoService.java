package com.estudos.services;

import com.estudos.entities.pedido.ItemPedido;
import com.estudos.entities.pedido.Pedido;
import com.estudos.infra.model.ItemPedidoAdicionado;
import com.estudos.infra.publisher.DomainEventPublisher;
import com.estudos.infra.publisher.ItemPedidoPublisher;
import com.estudos.repositories.ItemPedidoRepository;
import com.estudos.repositories.PedidoRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class ItemPedidoService {

    private final ItemPedidoPublisher publisher;
    private final PedidoRepository pedidoRepository;
    private final ItemPedidoRepository itemPedidoRepository;
    public ResponseEntity cadastrar(ItemPedido itemPedido) {
        Pedido pedido = pedidoRepository.findByPedidoId(itemPedido.getPedidoId());
        pedido.incrementaQuantidade(itemPedido.getQuantidade());
        itemPedidoRepository.save(itemPedido);
        publisher.publish(new ItemPedidoAdicionado(itemPedido.getQuantidade(), itemPedido.getPedidoId()));
/*
        pedidoRepository.save(pedido);
        */
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
    @EventListener
    public void adicionarQuantidadePedido(ItemPedidoAdicionado evento)
    {
        Pedido pedido = pedidoRepository.findByPedidoId(evento.getPedidoID());
        pedido.incrementaQuantidade(evento.getQuantidade());
        pedidoRepository.save(pedido);

    }
}
