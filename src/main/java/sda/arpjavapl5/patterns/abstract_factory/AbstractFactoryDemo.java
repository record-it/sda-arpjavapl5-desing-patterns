package sda.arpjavapl5.patterns.abstract_factory;

import sda.arpjavapl5.patterns.factory_method.Message;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory<Message> factory = new EmailMessageFactory();
    }
}
