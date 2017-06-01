package by.htp.cafelux.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.htp.cafelux.entity.User;
import by.htp.cafelux.dao.ConnectDB;
import static by.htp.cafelux.util.ConstantValue.*;

public class UserDaoImpl implements UserDao{

	@Override
	public User fetchByCredentials(String login, String password) {
		Connection conn = new ConnectDB().getConnection();
		User user = null;

		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(SQL_STATEMENT_SELECT_USER);
			ps.setString(1, login);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Long userId = rs.getLong(1);
				String log = rs.getString(2);
				String pass = rs.getString(3);
				int role = rs.getInt(4);
				String firstname = rs.getString(5);
				String lastname = rs.getString(6);
				String nickname = rs.getString(7);
				String telNumber = rs.getString(8);
				Long userPoints = rs.getLong(9);
				user = new User();
				user.setUserId(userId);
				user.setLogin(log);
				user.setPassword(pass);
				user.setRole(role);
				user.setFirstname(firstname);
				user.setLastname(lastname);
				user.setNickname(nickname);
				user.setTelNumber(telNumber);
				user.setUserPoints(userPoints);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}