package sda.arpjavapl5.patterns.proxy;

public class Counter implements Incrementable{
    int count;

    @Override
    public void increment(){
        count++;
    }

    public int value(){
        return count;
    }
}
