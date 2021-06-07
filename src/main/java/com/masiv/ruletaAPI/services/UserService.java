package com.masiv.ruletaAPI.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masiv.ruletaAPI.interfaceServices.IuserService;
import com.masiv.ruletaAPI.interfaces.IUser;
import com.masiv.ruletaAPI.model.User;

@Service
public class UserService implements IuserService{

	@Autowired
	private IUser data;
	@Override
	public Optional<User> findUser(int idUser) {
		return data.findById(idUser);
	}
	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		User saveUser = data.save(user);
		return saveUser.getId();
	}
	
}
