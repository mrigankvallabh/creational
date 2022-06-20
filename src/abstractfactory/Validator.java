package abstractfactory;

public interface Validator {
    default boolean isValid(CreditCard creditCard) {
        return false;
    }
}
