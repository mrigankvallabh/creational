package abstractfactory.amex;

import abstractfactory.CreditCard;
import abstractfactory.CreditCardFactory;
import abstractfactory.CreditCardType;
import abstractfactory.Validator;

public class AmexCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CreditCardType cardType) {
        return switch (cardType) {
            case GOLD -> new AmexGoldCreditCard();
            case PLATINUM -> new AmexPlatinumCreditCard();
            default -> new AmexStandardCreditCard();
        };
    }

    @Override
    public Validator getValidator(CreditCardType cardType) {
        return switch (cardType) {
            case GOLD -> new AmexGoldValidator();
            case PLATINUM -> new AmexPlatinumValidator();
            default -> new Validator() {
                @Override
                public boolean isValid(CreditCard creditCard) {
                    return true;
                }
            };
        };
    }
}
