import java.util.ArrayList;

public class HtmlTable {
    ArrayList<Student> students;

    public HtmlTable(ArrayList<Student> _students){
        students = _students;
    }

    public String toString(){
        String studentsHtml = "";

        for(Student student : students){
            studentsHtml += student.toHTML();
        }

        String htmlTable = "<table class=\"table table-hover\">";
        htmlTable += "<thead>\n" +
                "    <tr>\n" +
                "      <th scope=\"col\">#</th>\n" +
                "      <th scope=\"col\">First</th>\n" +
                "      <th scope=\"col\">Last</th>\n" +
                "      <th scope=\"col\">Group</th>\n" +
                "      <th scope=\"col\">Grades</th>\n" +
                "    </tr>\n" +
                "  </thead>";
        htmlTable += "<tbody>" + studentsHtml + "</tbody>";
        htmlTable += "</table>";

        return htmlTable;
    }
}
