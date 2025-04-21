package caesar_cipher;
import java.io.File;
import java.util.Scanner;

public class display {

    public display(File file) throws Throwable{

        //scans every line and displays it.
        Scanner sn = new Scanner(file);
        System.out.println("\nfile name: "+file.getName()+"\nfile contents:\n----------------------------------------");
        while(sn.hasNextLine()){
            System.out.println(sn.nextLine());}
        System.out.println("----------------------------------------");
    }
}
