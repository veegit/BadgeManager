package com.vee.badge.service;

/**
 * @author vee on Oct 4, 2013 at 8:16:23 PM
 *
 */
import java.util.List;

import com.vee.badge.model.User;

public interface UserService {

	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
	public List<User> getUsers();

}
