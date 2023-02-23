import java.sql.Date;
import java.text.DateFormat;

public class Calendar {

    public static void main(String[] args) {
        
        Date hoje = new Date(0);
        DateFormat df = DateFormat.getDateTimeInstance();

        System.out.println(hoje);
        System.out.println(df.format(hoje));

    }
    
}
