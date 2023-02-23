import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A09Ex05 {

    public static void main(String[] args) {
        

        try  {

            System.out.print("Digite a sua data de nascimento: ");
            Scanner scan = new Scanner(System.in);
            String data = scan.next();

            DateFormat df = DateFormat.getDateInstance();
            Date dataAtual = df.parse(data);

            SimpleDateFormat sdf = new SimpleDateFormat("E");

            System.out.println("Dia da semana: "+dataAtual);
        } catch (ParseException e) {
          
            e.printStackTrace();
        }

        

    }
    
}
