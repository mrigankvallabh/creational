package abstractfactory.amex;

import abstractfactory.CreditCard;
import abstractfactory.Validator;

public class AmexPlatinumValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return Validator.super.isValid(creditCard);
    }
}
