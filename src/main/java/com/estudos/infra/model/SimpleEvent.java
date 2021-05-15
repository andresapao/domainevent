package com.estudos.infra.model;

import java.time.LocalDate;
import java.util.UUID;

public abstract class SimpleEvent {
    private final UUID id;
    private final LocalDate createdTime;
    public SimpleEvent() {
        this.id = UUID.randomUUID();
        this.createdTime = LocalDate.now();
    }
}
