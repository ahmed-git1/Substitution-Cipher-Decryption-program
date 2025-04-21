package caesar_cipher;
import java.io.File;
import java.util.*;
public class file_selection {
    public file_selection(String cmd) throws Throwable {

        //current directory
        File directory = new File(System.getProperty("user.dir"));

        //filters files in directory and creates a list of all text files using a lambda expression
        File[] txtFiles = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

        System.out.print("\nselect file from list by typing its index (program displays txt files in root directory of project -user.dir-)");

        //display text files with indexes.
        int counter = 1;
        for(File txt: txtFiles){
            System.out.printf("\n%d - %s", counter, txt.getName());
            counter++;
        }

        System.out.print("\n\n>");

        Scanner sn = new Scanner(System.in);
        String selection = sn.next();
        //creates ref to selected file to be passed onto other classes
        File selectedFile = txtFiles[Integer.parseInt(selection)-1];

        //passes selected file to decrypt or display classes
        decrypt sys1;
        display sys2;
        if(cmd.equals("decrypt"))
            sys1 = new decrypt(selectedFile);
        else if (cmd.equals("display"))
            sys2 = new display(selectedFile);


    }
    }






