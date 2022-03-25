import java.util.ArrayList;

public class Student{
    int id;

    String lastName;
    String firstAndFatherName;
    int groupNumber;
    ArrayList<Grade> grades;

    public Student(int _id, String _lastName, String _firstAndFatherName, int _groupNumber, ArrayList<Grade> _grades){
        id = _id;
        lastName = _lastName;
        firstAndFatherName = _firstAndFatherName;
        groupNumber = _groupNumber;
        grades = _grades;
    }

    public String toHTML(){
        String htmlElement = "<tr><th scope=\"row\">"+ id +"</th>";
        htmlElement += "<td>"+ lastName +"</td>";
        htmlElement += "<td>"+ firstAndFatherName +"</td>";
        htmlElement += "<td>"+ groupNumber +"</td>";
        htmlElement += "<td>"+ grades.toString() +"</td></tr>";

        return htmlElement;
    }

    public String toSQL(){
        String gradesString = "'" + grades.toString() + "'";
        String sqlCommand = "INSERT INTO laba2.students (last_name, first_and_father_name, group_number) " +
                "VALUES ('" + lastName + "', '" + firstAndFatherName + "', " + groupNumber + ");";
        return sqlCommand;
    }
}