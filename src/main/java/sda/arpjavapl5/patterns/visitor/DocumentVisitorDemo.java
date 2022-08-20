package sda.arpjavapl5.patterns.visitor;

public class DocumentVisitorDemo {
    public static void main(String[] args) {
        Document document = Document.builder()
                .item(
                        Header.builder()
                                .level(2)
                                .content("Tytuł")
                                .build()
                )
                .item(
                        Paragraph.builder()
                                .content("Paragraf")
                                .build()
                )
                .item(
                        Document.builder()
                                .item(
                                        Paragraph
                                                .builder()
                                                .content("Nowy paragraf")
                                                .build()
                                )
                                .item(Link.builder().build())
                                .build()
                )
                .build();

        HtmlFormatterVisitor formatter = new HtmlFormatterVisitor();
        TextFormatterVisitor textFormatterVisitor = new TextFormatterVisitor();
        formatter.visit(document);
        System.out.println(formatter.html());
        textFormatterVisitor.visit(document);
        System.out.println(textFormatterVisitor.text());
    }
}
