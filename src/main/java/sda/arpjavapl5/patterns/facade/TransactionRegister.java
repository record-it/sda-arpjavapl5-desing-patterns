package sda.arpjavapl5.patterns.facade;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

enum TransactionRegister {
    INSTANCE;
    List<Transaction> register = new ArrayList<>();

    boolean register(Transaction transaction){
        if (transaction.source.balance.compareTo(transaction.amount) < 0){
            return false;
        }
        transaction.source.balance.subtract(transaction.amount);
        transaction.target.balance.add(transaction.amount);
        transaction.timestamp = LocalDateTime.now();
        register.add(transaction);
        return true;
    }
}
