public class HtmlPage {
    String title;
    String body;

    public HtmlPage(String _title, String _body){
        title = _title;
        body = _body;
    }

    public String toString()
    {
        String htmlPage = HtmlHelper.getPage(title, body);
        return htmlPage;
    }
}
