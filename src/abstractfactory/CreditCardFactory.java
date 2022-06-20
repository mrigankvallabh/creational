package abstractfactory;

import abstractfactory.amex.AmexCardFactory;
import abstractfactory.visa.VisaCardFactory;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore) {
        if (creditScore > 650) {
            return new AmexCardFactory();
        } else {
            return new VisaCardFactory();
        }
    }

    public abstract CreditCard getCreditCard(CreditCardType cardType);
    public abstract Validator getValidator(CreditCardType cardType);

}
