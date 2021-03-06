package by.htp.cafelux.command;

import by.htp.cafelux.entity.Course;
import by.htp.cafelux.entity.User;
import by.htp.cafelux.service.ServiceNoSuchUserException;
import by.htp.cafelux.service.UserService;
import by.htp.cafelux.service.UserServiceImpl;

import static by.htp.cafelux.util.ConstantValue.*;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginCommandAction implements CommandAction{
	
	private UserService userService;
	//private EquipmentService equipService;
	
	public LoginCommandAction(){
		userService = new UserServiceImpl();
	//	equipService = new EquipmentServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String page = PAGE_DEFAULT;
		
		String login = request.getParameter(REQUEST_PARAM_LOGIN);
		String password = request.getParameter(REQUEST_PARAM_PASSWORD);
		
		User user;
		try {
			user = userService.authorise(login, password);
			
			if(user.getRole()==0){
				//USER
				System.out.println("Autorise");
				//List<Course> equipment = equipService.list();
				//request.setAttribute(REQUEST_PARAM_LIST_EQ, equipment);
				page = PAGE_USER_MAIN;
			}
			else {
				// add report
				page = PAGE_ADMIN_MAIN;
			}
		} catch (ServiceNoSuchUserException e) {
			page = PAGE_ERROR;
			request.setAttribute(REQUEST_PARAM_ERROR_MSG, e.getMessage());
			//e.printStackTrace();
		}
		return page;
	}
}
