package sda.arpjavapl5.patterns.decorator;

import java.io.*;

public class StreamDecoratorDemo {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream stream = new FileInputStream("c:\\data\\data.txt");
        //BufferedInputStream jest dekoratorem strumieni klasy InputStream, dodaje buforowanie danych
        stream = new BufferedInputStream(stream);
        //BufferedReader jest dekoratorem strumieni klasy Reader
        final BufferedReader reader = new BufferedReader(new FileReader("c:\\data\\data.txt"));
        reader.lines().forEach(System.out::println);

    }
}
