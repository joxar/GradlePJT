import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ShowDate", urlPatterns = {"/ShowDate"} )
public class ShowDateServlet extends  javax.servlet.http.HttpServlet implements  javax.servlet.Servlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println(new java.util.Date());
        out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!!!!!");
    }
}
