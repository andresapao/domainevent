package com.estudos.infra.publisher;

import com.estudos.infra.model.SimpleEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ItemPedidoPublisher implements DomainEventPublisher{
    @Autowired
    private ApplicationEventPublisher publisher;

    @Override
    public void publish(SimpleEvent evento) {
        this.publisher.publishEvent(evento);
    }
}
