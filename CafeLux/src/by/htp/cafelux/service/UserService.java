package by.htp.cafelux.service;

import by.htp.cafelux.entity.User;

public interface UserService {
	
	User authorise(String login, String password) throws ServiceNoSuchUserException;
	
	String logOut(User user);

}
