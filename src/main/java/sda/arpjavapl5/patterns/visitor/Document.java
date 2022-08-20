package sda.arpjavapl5.patterns.visitor;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

@Builder
@Data
public class Document implements DocumentItem{

    @Singular
    private List<DocumentItem> items;

    @Override
    public void accept(DocumentItemVisitor visitor) {
        items.forEach(item -> item.accept(visitor));
    }


}
