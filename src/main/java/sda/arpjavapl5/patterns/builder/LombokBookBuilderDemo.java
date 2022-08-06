package sda.arpjavapl5.patterns.builder;

public class LombokBookBuilderDemo {
    public static void main(String[] args) {
        LombokBook book = LombokBook
                .builder()
                .title("C#")
                .author("Bloch")
                .build();
        System.out.println(book);
    }
}
