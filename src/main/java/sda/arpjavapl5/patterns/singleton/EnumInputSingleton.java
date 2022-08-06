package sda.arpjavapl5.patterns.singleton;

import java.util.Scanner;

public enum EnumInputSingleton {
    INSTANCE;

    public EnumInputSingleton getInstance(){
        return INSTANCE;
    }

    //pola i metody klasy singletona
    Scanner scanner = new Scanner(System.in);

    public Scanner getScanner(){
        return scanner;
    }
}
