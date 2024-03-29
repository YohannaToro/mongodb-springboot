package eci.cosw.data;

import eci.cosw.data.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String> {

    List<Todo> findByResponsible(String responsible);

    List<Todo> findByPriority(Int priority);

    List<Todo> findAllByStatus(String status);

}