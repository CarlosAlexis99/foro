package com.carlos_patito.foro.service;


import com.carlos_patito.foro.model.Response;
import com.carlos_patito.foro.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseService{

    @Autowired
    private ResponseRepository responseRepository;

    public List<Response> findAll() {
        return responseRepository.findAll();
    }

    public Optional<Response> findById(Long id) {
        return responseRepository.findById(id);
    }

    public void save(Response response) {
        responseRepository.save(response);

    }
    public void deleteById(Long id) {
        responseRepository.deleteById(id);
    }
}
