package abstractfactory;

public class CreditCard {

    protected int ccNumber;
    protected int ccNumberLength;

    public int getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(int ccNumber) {
        this.ccNumber = ccNumber;
    }

    public int getCcNumberLength() {
        return ccNumberLength;
    }

    public void setCcNumberLength(int ccNumberLength) {
        this.ccNumberLength = ccNumberLength;
    }

    @Override
    public String toString() {
        return "CreditCard [ccNumber=" + ccNumber + ", ccNumberLength=" + ccNumberLength + "]";
    }

}
