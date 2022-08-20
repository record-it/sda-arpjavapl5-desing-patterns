package sda.arpjavapl5.patterns.template;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

public class HtmlReport extends ReportTemplate{

    @Builder(builderMethodName = "htmlBuilder")
    public HtmlReport(String header, String title, String content, String footer) {
        super(header, title, content, footer);
    }

    @Override
    public String header() {
        return "<head><p>" + header + "</p></head>";
    }

    @Override
    public String title() {
        return "<h1>" + title + "</h1>";
    }

    @Override
    public String content() {
        return "<p>" + content + "</p>";
    }

    @Override
    public String footer() {
        return "<footer> <p> " + footer + "</footer> </p>";
    }


}
