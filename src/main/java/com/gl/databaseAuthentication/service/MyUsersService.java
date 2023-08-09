package com.gl.databaseAuthentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.databaseAuthentication.bean.MyUsers;
import com.gl.databaseAuthentication.dao.MyUsersRepository;

@Service
public class MyUsersService implements UserDetailsService {
	@Autowired
	private MyUsersRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		return repository.findById(username).get();
	}
	public void save(MyUsers users) {
		repository.save(users);
	}
	

}