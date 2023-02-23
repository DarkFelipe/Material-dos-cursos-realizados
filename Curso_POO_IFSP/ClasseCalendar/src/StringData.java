import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StringData {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String data = scan.next();
        System.out.println("Digite uma data aqui: ");

        try {
            String texto = "01/04/2000";

            DateFormat df = DateFormat.getDateInstance(0, null);

            java.util.Date hoje = df.parse(texto);

            SimpleDateFormat sdf = new SimpleDateFormat('E');
        } 
        catch (Exception e) {
            e.printStackTrace();
        }


        
    }
    
}
