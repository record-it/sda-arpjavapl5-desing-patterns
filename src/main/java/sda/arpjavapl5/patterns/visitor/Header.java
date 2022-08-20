package sda.arpjavapl5.patterns.visitor;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Header implements DocumentItem{
    private String content;
    private int level;

    @Override
    public void accept(DocumentItemVisitor visitor) {
        visitor.visit(this);
    }
}
