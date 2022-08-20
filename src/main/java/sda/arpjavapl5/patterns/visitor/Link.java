package sda.arpjavapl5.patterns.visitor;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Link implements DocumentItem{
    @Override
    public void accept(DocumentItemVisitor visitor) {
        visitor.visit(this);
    }
}
