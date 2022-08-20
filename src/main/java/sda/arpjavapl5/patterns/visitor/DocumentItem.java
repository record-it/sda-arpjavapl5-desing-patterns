package sda.arpjavapl5.patterns.visitor;

public interface DocumentItem {
    void accept(DocumentItemVisitor visitor);
}
