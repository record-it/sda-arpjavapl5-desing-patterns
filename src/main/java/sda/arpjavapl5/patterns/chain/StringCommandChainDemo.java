package sda.arpjavapl5.patterns.chain;

public class StringCommandChainDemo {
    public static void main(String[] args) {
        StringCommandHandler last = new CopyHandler(null);
        StringCommandHandler middle = new PasteHandler(last);
        StringCommandHandler first = new StartHandler(middle);
        //stwórz klasę handlera polecenie PASTE i włącz jego obiekt do łańucha
        //kod niezmienny
        System.out.println(first.handle("PASTE"));
    }
}
