package by.htp.cafelux.service;

import by.htp.cafelux.dao.UserDaoImpl;
import by.htp.cafelux.entity.User;
import by.htp.cafelux.service.ServiceNoSuchUserException;

public class UserServiceImpl implements UserService {
	private UserDaoImpl dao;

	public UserServiceImpl() {
		dao = new UserDaoImpl();
	}

	@Override
	public User authorise(String login, String password) throws ServiceNoSuchUserException {
		User user = dao.fetchByCredentials(login, password);
		if (user == null) {
			throw new ServiceNoSuchUserException("Invalid credentials");
		}
		return user;
	}

	@Override
	public String logOut(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
