package com.example.bigstarcollectible.dao;


import com.example.bigstarcollectible.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    //<S extends User>S save(User entity);
}


