package abstractfactory.visa;

import abstractfactory.CreditCard;
import abstractfactory.Validator;

public class VisaValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}
