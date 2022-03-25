public class Grade {
    Integer id;
    Integer userId;
    String name;
    Integer grade;

    public Grade(Integer _id, String _name, Integer _grade){
        id = _id;
        name = _name;
        grade = _grade;
    }

    public String toString(){
        return name + ": " + grade + ";";
    }

    public String toSQL(){
        return "INSERT INTO laba2.grades (name, grade, user_id) VALUES ('"+name+"', "+grade+", "+userId+");";
    }
}
