package sda.arpjavapl5.patterns.template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class ReportTemplate {
    protected String header;
    protected String title;
    protected String content;
    protected String footer;

    public abstract String header();
    public abstract String title();
    public abstract String content();
    public abstract String footer();

    final public String report(){
        return new StringBuilder()
                .append(header())
                .append(title())
                .append(content())
                .append(footer())
                .toString();
    }
}
