package com.cropify.UserService.repository;

import org.springframework.data.repository.CrudRepository;

import com.cropify.UserService.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
