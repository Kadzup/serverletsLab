public class HtmlHelper {
    static String getHead(String title){
        return  "<head>" +
                "<meta charset=\"utf-8\">" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "<title>" + title + "</title>\n" +
                "</head>";
    }

    static String getBody(String body){
        return "<body>" +
                "<div class=\"container\">\n" +
                "  <div class=\"row\">\n" +
                "    <div class=\"col\">\n" +
                getNavBar() +
                body +
                "    </div>\n" +
                "  </div>\n" +
                "</div>"+
                "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>"+
                "</body>";
    }

    static String getNavBar(){
        return "<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n" +
                "  <div class=\"container-fluid\">\n" +
                "    <a class=\"navbar-brand\" href=\"./\">Laba 2</a>\n" +
                "    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "      <span class=\"navbar-toggler-icon\"></span>\n" +
                "    </button>\n" +
                "    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n" +
                "      <ul class=\"navbar-nav\">\n" +
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link active\" aria-current=\"page\" href=\"./\">View data</a>\n" +
                "        </li>\n" +
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link\" href=\"./form\">Create record</a>\n" +
                "        </li>\n" +
                "        <li class=\"nav-item\">\n" +
                "          <a class=\"nav-link\" href=\"./grades\">Grades AVG</a>\n" +
                "        </li>\n" +
                "      </ul>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</nav>";
    }

    static String getHtml(String head, String body){
        return "<!doctype html><html lang=\"en\">" + head + body + "</html>";
    }

    public static String getPage(String title, String body){
        String htmlHead = getHead(title);
        String htmlBody = getBody(body);

        return getHtml(htmlHead, htmlBody);
    }
}
