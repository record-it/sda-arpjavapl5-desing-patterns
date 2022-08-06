package sda.arpjavapl5.patterns.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("Starting program");
        //EagerInputSingleton eagerInputSingleton = EagerInputSingleton.getInstance();

        System.out.println("Calling lazy singleton");
        LazyInputSingleton lazyInputSingleton = LazyInputSingleton.getInstance();
        System.out.println(EagerInputSingleton.Test);

        EnumInputSingleton enumInputSingleton = EnumInputSingleton.INSTANCE.getInstance();

        String name = enumInputSingleton.getScanner().nextLine();
    }
}
