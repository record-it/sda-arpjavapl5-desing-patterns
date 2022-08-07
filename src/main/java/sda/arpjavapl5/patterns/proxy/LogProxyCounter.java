package sda.arpjavapl5.patterns.proxy;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogProxyCounter implements Incrementable{
    int count;

    @Override
    public void increment(){
        count++;
        log.info("Incremented, actual value: " + count);
    }

    public int value(){
        return count;
    }
}
