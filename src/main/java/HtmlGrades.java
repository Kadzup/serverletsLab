import java.util.ArrayList;

public class HtmlGrades {
    ArrayList<GradeAVG> gradesAVG;

    public HtmlGrades(ArrayList<GradeAVG> _gradesAVG){
        gradesAVG = _gradesAVG;
    }

    public String toString(){
        String gradesHtml = "";

        for(GradeAVG gradeAVG : gradesAVG){
            gradesHtml += gradeAVG.toHTML();
        }

        String htmlTable = "<table class=\"table table-hover\">";
        htmlTable += "<thead>\n" +
                "    <tr>\n" +
                "      <th scope=\"col\">Name</th>\n" +
                "      <th scope=\"col\">AVG</th>\n" +
                "    </tr>\n" +
                "  </thead>";
        htmlTable += "<tbody>" + gradesHtml + "</tbody>";
        htmlTable += "</table>";

        return htmlTable;
    }
}
