package dateformatutility;
import java.util.Date;
public class DateFormatUtility {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(DateUtils.formatDate(today, "dd/MM/yyyy"));
        System.out.println(DateUtils.formatDate(today, "yyyy-MM-dd"));
    }
}