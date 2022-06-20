package abstractfactory.visa;

import abstractfactory.CreditCard;
import abstractfactory.CreditCardFactory;
import abstractfactory.CreditCardType;
import abstractfactory.Validator;

public class VisaCardFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CreditCardType cardType) {
        return switch (cardType) {
            case GOLD -> new VisaGoldCard();
            case PLATINUM -> new VisaPlatinumCard();
            default -> new VisaStandardCard();
        };
    }

    @Override
    public Validator getValidator(CreditCardType cardType) {
        return new VisaValidator();
    }
}
