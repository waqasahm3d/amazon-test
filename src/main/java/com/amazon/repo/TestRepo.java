package com.amazon.repo;

import com.amazon.domain.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepo extends MongoRepository<Test,String> {

}
