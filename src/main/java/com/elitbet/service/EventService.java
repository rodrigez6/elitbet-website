package com.elitbet.service;

import com.elitbet.model.Event;

import java.util.List;

public interface EventService {
    Event findById(String eventId);

    List<Event> findAllByEventType(String description);

    Event create(String id, String eventType, long time, String names, String tournament, String coefficients);

    Event update(String id, String tournament, long time, String names, String status, String results);
}