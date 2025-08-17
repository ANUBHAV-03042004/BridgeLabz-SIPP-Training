package junit.testingdateformatter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

 // Convert yyyy-MM-dd → dd-MM-yyyy
 public static String formatDate(String inputDate) throws ParseException {
     SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
     SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

     Date date = inputFormat.parse(inputDate);
     return outputFormat.format(date);
 }
}
