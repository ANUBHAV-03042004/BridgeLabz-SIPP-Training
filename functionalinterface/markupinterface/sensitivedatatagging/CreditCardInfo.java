package markupinterface.sensitivedatatagging;

class CreditCardInfo implements SensitiveData {
    String cardNumber;
    CreditCardInfo(String cardNumber) { this.cardNumber = cardNumber; }
}
