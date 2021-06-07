package com.masiv.ruletaAPI.interfaceServices;

import java.util.Optional;

import com.masiv.ruletaAPI.model.User;

public interface IuserService {
	
	public Optional<User> findUser(int idUser);
	public int save(User user);
}
