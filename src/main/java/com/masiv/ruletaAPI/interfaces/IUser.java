package com.masiv.ruletaAPI.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masiv.ruletaAPI.model.User;

@Repository
public interface IUser extends CrudRepository<User, Integer>{}
