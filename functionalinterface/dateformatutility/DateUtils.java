package dateformatutility;

import java.text.SimpleDateFormat;
import java.util.Date;

interface DateUtils {
    static String formatDate(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}
