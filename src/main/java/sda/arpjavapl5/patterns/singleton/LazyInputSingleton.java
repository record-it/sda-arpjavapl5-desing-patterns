package sda.arpjavapl5.patterns.singleton;

import java.util.Scanner;

//Eager
public class LazyInputSingleton {
    //składowe wynikające ze wzorca
    //pole statyczne z instancją singletona
    private static LazyInputSingleton instance;

    //metoda statyczna do pobieranie instancji
    public static LazyInputSingleton getInstance(){
        if (instance == null){
            instance = new LazyInputSingleton();
        }
        return instance;
    }

    //koniecznie konstruktor musi być prywatny
    private LazyInputSingleton(){
        System.out.println("Creating lazy singleton");
    }

    //składowe klasy
    //pola instancyjne singletona
    Scanner scanner = new Scanner(System.in);

    //metody instancyjne singletona
    public Scanner getScanner(){
        return scanner;
    }
}

