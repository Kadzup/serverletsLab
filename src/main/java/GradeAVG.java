public class GradeAVG {
    String name;
    double avg;

    public GradeAVG(String _name, double _avg){
        name = _name;
        avg = _avg;
    }

    public String toHTML(){
        String htmlElement = "<tr><th scope=\"row\">"+ name +"</th>";
        htmlElement += "<td>"+ avg +"</td></tr>";
        return htmlElement;
    }
}
