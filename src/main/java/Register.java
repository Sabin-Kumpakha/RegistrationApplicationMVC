

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String emailid = request.getParameter("email");
		String upassword = request.getParameter("password");
		String ucity = request.getParameter("ucity");
		
		Model model = new Model();
		model.setUname(uname);
		model.setEmail(emailid);
		model.setUpassword(upassword);
		model.setUcity(ucity);
				
		int rowAffected = model.register();
		
		//session
		HttpSession session = request.getSession();
		session.setAttribute("uname", uname);
		
		if (rowAffected == 0) {
			response.sendRedirect("/RegistrationApplicationMVC/failure.jsp");
		} else {
			response.sendRedirect("/RegistrationApplicationMVC/success.jsp");
		}
	}

}
