package sda.arpjavapl5.patterns.visitor;

public class TextFormatterVisitor implements DocumentItemVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Header header) {
        sb.append(System.lineSeparator())
                .append(header.getContent().toUpperCase())
                .append(System.lineSeparator());
    }

    @Override
    public void visit(Paragraph paragraph) {
        sb.append(System.lineSeparator());
        sb.append("   " + paragraph.getContent());
    }

    @Override
    public void visit(Document document) {
        document.getItems().forEach(d -> d.accept(this));
    }

    @Override
    public void visit(DocumentItem item) {
        sb.append("No implemented for this type");
    }

    public String text(){
        return sb.toString();
    }
}
