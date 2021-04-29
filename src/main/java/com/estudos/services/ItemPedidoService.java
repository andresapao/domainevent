package com.estudos.services;

import com.estudos.entities.pedido.ItemPedido;
import com.estudos.entities.pedido.Pedido;
import com.estudos.repositories.ItemPedidoRepository;
import com.estudos.repositories.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@Service
@AllArgsConstructor
public class ItemPedidoService {
    private final PedidoRepository pedidoRepository;
    private final ItemPedidoRepository itemPedidoRepository;
    public ResponseEntity cadastrar(ItemPedido itemPedido) {
        Pedido pedido = pedidoRepository.findByPedidoId(itemPedido.getPedidoId());
        pedido.incrementaQuantidade(itemPedido.getQuantidade());
        itemPedidoRepository.save(itemPedido);
        pedidoRepository.save(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
