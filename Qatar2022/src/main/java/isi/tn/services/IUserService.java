package isi.tn.services;

import java.util.List;

import isi.tn.entities.User;

public interface IUserService {

	User saveUser(User user);

	List<User> findAllUsers();
}
