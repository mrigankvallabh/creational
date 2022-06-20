package abstractfactory.amex;

import abstractfactory.CreditCard;
import abstractfactory.Validator;

public class AmexGoldValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return Validator.super.isValid(creditCard);
    }
}
