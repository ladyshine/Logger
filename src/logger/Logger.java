package logger;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pollachini Silvia
 */
public class Logger {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        FileWriter file;
        boolean vaiAvanti = true;
        int riga1 = 1;

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        try{
            file = new FileWriter("Logger.txt");
            while (vaiAvanti) {
                System.out.println("Si vuole continuare? (sì/no)");
                String answer = sc.nextLine();
                if (answer.equalsIgnoreCase("no")) {
                file.close();
                  break;
               
            }
                if (answer.equalsIgnoreCase("si")) {
                
                System.out.print("Riga " + riga1 + ": ");
                String testo = sc.nextLine();
                    Date date = new Date();

                    file.write("[" + dateFormat.format(date) + "] " + testo + "\r");
                    riga1++;
            }
                
                else 
                    System.out.println("scriva sì o no: "); {   
               

            } 
            }
        }
        catch(Exception ex){
            System.out.println("Errore: " + ex.getMessage());
        }

    }
    
}
