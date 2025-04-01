package com.example.springOne.repository;

import com.example.springOne.entity.User;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String username);

    User deleteByUserName(String username);

}