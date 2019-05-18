package com.stago.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.stago.model.User;


public interface UserRepository extends CrudRepository<User, UUID> {

}
