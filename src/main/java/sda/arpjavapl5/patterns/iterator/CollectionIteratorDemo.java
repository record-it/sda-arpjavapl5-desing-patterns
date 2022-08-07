package sda.arpjavapl5.patterns.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionIteratorDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("adam");
        names.add("ewa");

        final Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();//tylko raz można wywołać!!!
            System.out.println(name);
        }


        for(Iterator<String> i = names.iterator(); i.hasNext();){
            String name = i.next();
            System.out.println(name);
        }

        //Pętla foreach działa tylko dla typów Iterable
        for(String name: names){
            System.out.println(name);
        }

    }
}
