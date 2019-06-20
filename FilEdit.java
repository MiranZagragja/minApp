import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class FilEdit{
    public static void main(String[] args) {
        
        try {
            File fil = new File("hverdag.txt");
            Scanner sc = new Scanner(fil);
            FileWriter skriv = new FileWriter("bearbeidet.txt");
            String linje = sc.nextLine();
             while(sc.hasNextLine()){
                if(linje.startsWith("1")){
                    skriv.write(linje + "\n");
                }
                linje = sc.nextLine();
             }

             skriv.close();
             sc.close();
        } catch (Exception e) {
            System.out.println("Gikk feil ved innlesing av fil");
        }
        
    }
}