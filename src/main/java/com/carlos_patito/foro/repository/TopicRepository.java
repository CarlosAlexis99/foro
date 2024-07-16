package com.carlos_patito.foro.repository;


import com.carlos_patito.foro.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

    Optional<Topic> findByMessage(String message);
}
