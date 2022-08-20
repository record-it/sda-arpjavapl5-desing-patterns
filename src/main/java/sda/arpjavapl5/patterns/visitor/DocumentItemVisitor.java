package sda.arpjavapl5.patterns.visitor;

public interface DocumentItemVisitor {
    void visit(Header header);
    void visit(Paragraph header);
    void visit(Document header);
    //zachowanie domyślne dla pozostałych klas implementujących DocumentItem
    void visit(DocumentItem item);
}
