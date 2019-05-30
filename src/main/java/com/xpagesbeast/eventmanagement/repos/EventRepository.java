package com.xpagesbeast.eventmanagement.repos;

import com.xpagesbeast.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
