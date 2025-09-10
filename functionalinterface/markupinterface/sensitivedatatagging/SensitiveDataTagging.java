package markupinterface.sensitivedatatagging;

public class SensitiveDataTagging {
    public static void main(String[] args) {
        CreditCardInfo info = new CreditCardInfo("1234-5678-9876-5432");

        if (info instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data before storage...");
        }
    }
}