import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        HtmlPage page = new HtmlPage("Create record",new HtmlForm().toString());
        printWriter.write(page.toString());
        printWriter.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Integer groupNumber = Integer.parseInt(request.getParameter("groupNumber"));

        String grade1Name = request.getParameter("grade1Name");
        String grade2Name = request.getParameter("grade2Name");
        String grade3Name = request.getParameter("grade3Name");
        Integer grade1 = Integer.parseInt(request.getParameter("grade1"));
        Integer grade2 = Integer.parseInt(request.getParameter("grade2"));
        Integer grade3 = Integer.parseInt(request.getParameter("grade3"));

        ArrayList<Grade> grades = new ArrayList<Grade>();
        grades.add(new Grade(-1, grade1Name, grade1));
        grades.add(new Grade(-1, grade2Name, grade2));
        grades.add(new Grade(-1, grade3Name, grade3));

        Student student = new Student(-1, lastName, firstName, groupNumber, grades);
        new DBWorker().createRecord(student);
        HtmlPage page = new HtmlPage("Create record",new HtmlForm().toString());
        printWriter.write(page.toString());
        printWriter.close();
    }
}
