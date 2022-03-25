public class HtmlForm {
    public String toString(){
        String formHtml = "<form action=\"form\" method=\"POST\">\n" +
                "    <div class=\"form-group\">\n" +
                "        <label for=\"inputFirstName\">First name and father name</label>\n" +
                "        <input type=\"text\" class=\"form-control\" id=\"inputFirstName\" aria-describedby=\"fnHelp\" name=\"firstName\"\n" +
                "            placeholder=\" Enter first name and father name\" required>\n" +
                "        <small id=\"fnHelp\" class=\"form-text text-muted\">Enter your First name (Dmytro) and father name\n" +
                "            (Vitaliyovich)</small>\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label for=\"inputLastName\">Last name</label>\n" +
                "        <input type=\"text\" class=\"form-control\" id=\"inputLastName\" aria-describedby=\"lnHelp\" name=\"lastName\"\n" +
                "            placeholder=\"Enter last name\" required>\n" +
                "        <small id=\"fnHelp\" class=\"form-text text-muted\">Enter your last name (Stefurak)</small>\n" +
                "    </div>\n" +
                "    <div class=\"form-group\">\n" +
                "        <label for=\"inputGroupNumber\">Group number</label>\n" +
                "        <input type=\"number\" class=\"form-control\" id=\"inputGroupNumber\" name=\"groupNumber\" aria-describedby=\"grnHelp\"\n" +
                "            placeholder=\"Enter group number\" required>\n" +
                "        <small id=\"grnHelp\" class=\"form-text text-muted\">Enter group number</small>\n" +
                "    </div>\n" +
                "    <div class=\"form-row\">\n" +
                "        <div class=\"form-group col-md-6\">\n" +
                "            <label for=\"inputGrade1\">Grade 1</label>\n" +
                "            <input type=\"text\" class=\"form-control\" id=\"inputGrade1Name\" name=\"grade1Name\" placeholder=\"Grade 1 name\"\n" +
                "                required>\n" +
                "            <input type=\"number\" class=\"form-control\" id=\"inputGrade1\" name=\"grade1\" placeholder=\"Grade 1\" required>\n" +
                "        </div>\n" +
                "        <div class=\"form-group col-md-6\">\n" +
                "            <label for=\"inputGrade2\">Grade 2</label>\n" +
                "            <input type=\"text\" class=\"form-control\" id=\"inputGrade2Name\" name=\"grade2Name\" placeholder=\"Grade 2 name\" required>\n" +
                "            <input type=\"number\" class=\"form-control\" id=\"inputGrade2\" name=\"grade2\" placeholder=\"Grade 2\" required>\n" +
                "        </div>\n" +
                "        <div class=\"form-group col-md-6\">\n" +
                "            <label for=\"inputGrade3\">Grade 3</label>\n" +
                "            <input type=\"text\" class=\"form-control\" id=\"inputGrade3Name\" name=\"grade3Name\" placeholder=\"Grade 3 name\" required>\n" +
                "            <input type=\"number\" class=\"form-control\" id=\"inputGrade3\" name=\"grade3\" placeholder=\"Grade 3\" required>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <br><br>\n" +
                "    <button type=submit class=btn btn-primary>Create record</button>\n" +
                "</form>";

        return formHtml;
    }
}
