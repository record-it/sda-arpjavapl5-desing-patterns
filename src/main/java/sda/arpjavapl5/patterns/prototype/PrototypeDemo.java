package sda.arpjavapl5.patterns.prototype;

import sda.arpjavapl5.patterns.factory_method.EmailMessage;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = Book.builder()
                .id("1234")
                .author("Bloch")
                .title("Java")
                .build();
        System.out.println("Oryginał");
        System.out.println(book);
        System.out.println("Klon 1");
        System.out.println(book.cloneWithId("456"));
        System.out.println("Klon 2");
        System.out.println(book.clone());
    }
}
