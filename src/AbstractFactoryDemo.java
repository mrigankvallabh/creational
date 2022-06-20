import java.util.logging.Logger;

import abstractfactory.CreditCard;
import abstractfactory.CreditCardFactory;
import abstractfactory.CreditCardType;

public class AbstractFactoryDemo {
    private static final Logger LOG = Logger.getLogger(AbstractFactoryDemo.class.getName());
    public static void main(String[] args) {
        CreditCardFactory abstractCardFactory = CreditCardFactory.getCreditCardFactory(680);
        CreditCard card = abstractCardFactory.getCreditCard(CreditCardType.PLATINUM);

        LOG.info(card.toString());
    }
}
