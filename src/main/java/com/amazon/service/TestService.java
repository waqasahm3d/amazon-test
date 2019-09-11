package com.amazon.service;

import com.amazon.domain.Test;
import com.amazon.repo.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestRepo testRepo;

    public List<Test> getAllTest(){
        return testRepo.findAll();
    }
}
