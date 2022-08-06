package sda.arpjavapl5.patterns.facade;

import java.math.BigDecimal;
import java.util.Optional;

public class TransactionRegisterFacade {

    Accounts accounts = Accounts.INSTANCE;
    TransactionRegister register = TransactionRegister.INSTANCE;

    public String makeTransaction(
            int sourceId,
            int targetId,
            double amount
    ) {
        final Optional<Account> opSource = accounts.find(sourceId);
        final Optional<Account> opTarget = accounts.find(targetId);
        if (!opTarget.isPresent() || !opSource.isPresent()) {
            return "Brak takiego konta!";
        }
        Transaction transaction = Transaction
                .builder()
                .source(opSource.get())
                .target(opTarget.get())
                .amount(new BigDecimal(amount))
                .build();
        final boolean isTransaction = register.register(transaction);
        if (isTransaction){
            return "Sukces. Kwota została przelana";
        } else {
            return "Transakcja nie została wykonana";
        }

    }
}
