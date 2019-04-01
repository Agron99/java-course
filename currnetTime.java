import java.text.SimpleDateFormat;
import java.util.Calendar;

public class currnetTime {

    public static void main(String[] args) {
        while(true) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");//format e hour minute second

            System.out.print("\rcurrent time of your pc is:    " + sdf.format(cal.getTime()));
        }
    }

}