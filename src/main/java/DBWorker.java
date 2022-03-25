import java.sql.*;
import java.util.ArrayList;

public class DBWorker {
    public Connection connection;

    public DBWorker(){
        String dbName = "laba2";
        String driverName = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://localhost:3306/"+dbName+"?useSSL=false&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
        String userName = "root";
        String userPwd = "root";

        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(jdbcUrl, userName, userPwd);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<GradeAVG> getGradesAVG(){
        try {
            String gradesQuery = "SELECT name, AVG(grade) AS val_1 FROM grades GROUP BY name;";
            var statement = connection.prepareStatement(gradesQuery);
            ResultSet gradesRes = statement.executeQuery();

            ArrayList<GradeAVG> grades = new ArrayList<GradeAVG>();

            while(gradesRes.next())
            {
               String name = gradesRes.getString("name");
               double avg = gradesRes.getDouble("val_1");
               grades.add(new GradeAVG(name, avg));
            }

            return grades;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<GradeAVG>();
        }
    }

    public void createRecord(Student student){
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(student.toSQL(), Statement.RETURN_GENERATED_KEYS);
            var res = statement.getGeneratedKeys();
            int autoIncKeyFromApi = -1;

            res = statement.getGeneratedKeys();

            if (res.next()) {
                autoIncKeyFromApi = res.getInt(1);
            } else {
            }

            for(Grade grade : student.grades){
                grade.userId = autoIncKeyFromApi;
                statement.executeUpdate(grade.toSQL());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getStudents(){
        try {
            String studentsQuery = "select * from laba2.students;";
            var statement = connection.prepareStatement(studentsQuery);
            ResultSet studentsRes = statement.executeQuery();
            ArrayList<Student> students = new ArrayList<Student>();

            while(studentsRes.next())
            {
                Integer id = studentsRes.getInt("id");
                String lastName = studentsRes.getString("last_name");
                String firstName = studentsRes.getString("first_and_father_name");
                Integer groupNumber = studentsRes.getInt("group_number");

                String gradesQuery = "select * from laba2.grades where user_id="+id+";";
                var gradesStatement = connection.prepareStatement(gradesQuery);
                ResultSet gradesRes = gradesStatement.executeQuery();

                ArrayList<Grade> grades = new ArrayList<Grade>();

                while(gradesRes.next())
                {
                    Integer gId = gradesRes.getInt("id");
                    String gName = gradesRes.getString("name");
                    Integer gGrade = gradesRes.getInt("grade");

                    grades.add(new Grade(gId,gName, gGrade));
                }

                students.add(new Student(id, lastName, firstName, groupNumber, grades));
            }

            return students;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<Student>();
        }
    }

}
