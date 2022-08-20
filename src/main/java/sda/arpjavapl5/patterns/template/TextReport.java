package sda.arpjavapl5.patterns.template;

import lombok.Builder;

public class TextReport extends ReportTemplate{

    @Builder(builderMethodName = "textBuilder")
    public TextReport(String header, String title, String content, String footer) {
        super(header, title, content, footer);
    }

    @Override
    public String header() {
        return header+"\n\n";
    }

    @Override
    public String title() {
        return title +"\n";
    }

    @Override
    public String content() {
        return content + "\n\n";
    }

    @Override
    public String footer() {
        return footer +"\n";
    }
}
