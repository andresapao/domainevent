package com.estudos.infra.publisher;

import com.estudos.infra.model.SimpleEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public interface DomainEventPublisher {
    void publish(SimpleEvent evento);
}