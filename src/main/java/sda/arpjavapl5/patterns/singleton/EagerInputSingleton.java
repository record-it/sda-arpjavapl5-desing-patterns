package sda.arpjavapl5.patterns.singleton;

import java.util.Scanner;

//Eager
public class EagerInputSingleton {
    //składowe wynikające ze wzorca
    //pole statyczne z instancją singletona
    private static EagerInputSingleton instance = new EagerInputSingleton();

    public static int Test = 10;
    static {
        System.out.println("Loading EagerInputSingleton class");
    }

    //metoda statyczna do pobieranie instancji
    public static EagerInputSingleton getInstance(){
        return instance;
    }

    //koniecznie konstruktor musi być prywatny
    private EagerInputSingleton(){
        System.out.println("Creating eager singleton");
    }

    //składowe klasy
    //pola instancyjne singletona
    Scanner scanner = new Scanner(System.in);

    //metody instancyjne singletona
    public Scanner getScanner(){
        return scanner;
    }
}
