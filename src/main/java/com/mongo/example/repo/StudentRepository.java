package com.mongo.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongo.example.models.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
