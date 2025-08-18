package PaymentProcessor;

public class PaymentProcessor {
    public static void main(String[] args) {
        Transaction<UPI> upiTxn = new Transaction<>(new UPI());
        upiTxn.process();

        Transaction<Card> cardTxn = new Transaction<>(new Card());
        cardTxn.process();

        Transaction<NetBanking> nbTxn = new Transaction<>(new NetBanking());
        nbTxn.process();
    }
}