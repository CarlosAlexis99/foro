package com.carlos_patito.foro.service;



import com.carlos_patito.foro.model.Topic;
import com.carlos_patito.foro.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topic;

    public List<Topic> findAll() {
        return (List<Topic>) topic.findAll();
    }

    public Optional<Topic> findById(Long id) {
        return topic.findById(id);
    }

    public Optional<Topic> findByMessage(String message) {
        return topic.findByMessage(message);
    }


    public void save(Topic topic) {
        this.topic.save(topic);
    }


    public void deleteById(Long id) {
        topic.deleteById(id);
    }
}
