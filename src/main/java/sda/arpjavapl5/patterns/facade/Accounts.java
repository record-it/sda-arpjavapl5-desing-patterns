package sda.arpjavapl5.patterns.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

enum Accounts {
    INSTANCE;

    Map<Integer, Account> accounts = Map.of(
            1, Account.builder().id(1).balance(new BigDecimal(100)).pesel("111111111").build(),
            2, Account.builder().id(2).balance(new BigDecimal(200)).pesel("222222222").build(),
            3, Account.builder().id(3).balance(new BigDecimal(50)).pesel("333333333").build()
    );

    Optional<Account> find(int id){
        if (accounts.containsKey(id)){
            return Optional.of(accounts.get(id));
        }
        return Optional.empty();
    }
}
