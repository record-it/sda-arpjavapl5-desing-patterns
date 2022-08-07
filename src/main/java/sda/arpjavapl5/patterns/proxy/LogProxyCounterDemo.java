package sda.arpjavapl5.patterns.proxy;

public class LogProxyCounterDemo {
    static boolean LOG_COUNTER = false;
    static Incrementable getCounter(){
        if (LOG_COUNTER){
            return new LogProxyCounter();
        } else {
            return new Counter();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Incrementable counter = getCounter();
        counter.increment();
        Thread.sleep(10);
        counter.increment();
        System.out.println(counter.value());
    }
}
