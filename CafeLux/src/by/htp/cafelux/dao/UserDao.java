package by.htp.cafelux.dao;

import by.htp.cafelux.entity.User;

public interface UserDao {
	
	User fetchByCredentials(String login, String password);

}
