package com.xpagesbeast.eventmanagement.repos;

import com.xpagesbeast.eventmanagement.entities.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {
}
