import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class BonusDatesFinder {
    private final String monthDayFormat = "-01-01";
    private final StringReverser stringReverser;
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public BonusDatesFinder() {
        this.stringReverser = new StringReverser();
    }

    public void printBonusDatesBetween(int fromYear, int toYear) throws ParseException {
        Date fromDate = convertIntToDate(fromYear);
        Date toDate = convertIntToDate(toYear);
        LocalDate startDate = convertDateToLocalDate(fromDate);
        LocalDate endDate = convertDateToLocalDate(toDate); //conversion from Date to LocalDate needed for expressive for loop

        for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
            String dateString = date.toString();
            dateString = dateString.replace("-", "");  //format date string to check if date is palindrome
            if (dateString.equals(stringReverser.reverseString(dateString))) {
                System.out.println(date); //if date string is palindrome, print date
            }
        }

    }

    public Date convertIntToDate(int number) throws ParseException {
        return formatter.parse(number + monthDayFormat);
    }

    public LocalDate convertDateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
