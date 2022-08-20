package sda.arpjavapl5.patterns.template;

import java.util.ArrayList;
import java.util.List;

public class ReportTemplateDemo {
    public static void main(String[] args) {
        List<ReportTemplate> reports = new ArrayList<>();
        reports.add(
                HtmlReport.htmlBuilder()
                        .content("Raport o Java")
                        .title("Java")
                        .header("Raport z dnia 20.08.2022")
                        .footer("Opracował Jab Kowalski")
                        .build()
        );
        reports.add(
                TextReport.textBuilder()
                        .content("Raport o Java")
                        .title("Java")
                        .header("Raport z dnia 20.08.2022")
                        .footer("Opracował Jab Kowalski")
                        .build()
        );

        reports.forEach(report -> System.out.println(report.report()));
    }
}
