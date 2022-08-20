package sda.arpjavapl5.patterns.visitor;

public class HtmlFormatterVisitor implements DocumentItemVisitor{
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Header header) {
        sb.append("<h" + header.getLevel() + ">")
                .append(header.getContent())
                .append("</h" + header.getLevel() + ">");
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append("<p>")
                .append(paragraph.getContent())
                .append("</p>");
    }

    @Override
    public void visit(Document document) {
        document.getItems().forEach(d -> d.accept(this));
    }

    @Override
    public void visit(DocumentItem item) {

    }

    public String html(){
        return sb.toString();
    }
}
