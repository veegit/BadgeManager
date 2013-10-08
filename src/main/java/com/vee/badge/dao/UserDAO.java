package com.vee.badge.dao;

/**
 * @author vee on Oct 4, 2013 at 8:15:17 PM
 *
 */
import java.util.List;

import com.vee.badge.model.User;

public interface UserDAO {

	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int id);
	public void deleteUser(int id);
	public List<User> getUsers();

}
