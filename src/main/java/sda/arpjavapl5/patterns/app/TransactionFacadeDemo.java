package sda.arpjavapl5.patterns.app;

import sda.arpjavapl5.patterns.facade.TransactionRegisterFacade;

public class TransactionFacadeDemo {
    public static void main(String[] args) {
        TransactionRegisterFacade facade = new TransactionRegisterFacade();
        final String feedback = facade.makeTransaction(1, 2, 34);
        System.out.println(feedback);
        System.out.println(facade.makeTransaction(2, 1, 1000));
        System.out.println(facade.makeTransaction(2, 6, 1000));
    }
}
