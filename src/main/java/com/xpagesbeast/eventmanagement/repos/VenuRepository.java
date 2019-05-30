package com.xpagesbeast.eventmanagement.repos;

import com.xpagesbeast.eventmanagement.entities.Organizer;
import com.xpagesbeast.eventmanagement.entities.Venue;
import org.springframework.data.repository.CrudRepository;

public interface VenuRepository extends CrudRepository<Venue, Long> {
}
