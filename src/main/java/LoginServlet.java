import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }

        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isAdmin = username.equals("admin") && password.equals("password");
        boolean isLoggedIn = username.equals("juan") && password.equals("password");

        HttpSession session = request.getSession();

        if (isLoggedIn) {
            session.setAttribute("user", username);
            response.sendRedirect("/profile");
        }


//        if (isAdmin) {
//            session.setAttribute("isAdmin", true);
//            response.sendRedirect("/secret-admin-page");
//        } else {
//            response.sendRedirect("/WEB-INF/login");
//        }

        //set the session object to a variable on the HttpSession class
//        HttpSession session = request.getSession();
//
//        String darkMode = request.getParameter("color");
//
//        session.setAttribute("darkM0ode", darkMode);
//
//        //on a different servlet(profile page)
//        //with our getAttribute method, our return is always a generic Object type
//        //therefore we need to explicitly cast the object to the correct type
//        session.getAttribute("darkMode");
//        String darkSelected = (String) session.getAttribute("darkMode");
//
//        session.removeAttribute("darkMode");
//
//        //destroys the session
//        session.invalidate();
//

    }
}
