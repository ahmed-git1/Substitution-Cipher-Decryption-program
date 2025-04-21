package caesar_cipher;
import java.util.*;

public class main {
    public static void main(String[] args)throws Throwable{

        Scanner sn = new Scanner(System.in);
        while(true) {
            System.out.print("\nDecrypt a file: enter '1' \nDisplay a file: enter '2'\nterminate program: enter '3'\n\n>");
            String input = sn.next();

            //user selects desired action. then chooses which file to perform the action on.
            //the action is passed to the selection class which passes the file to the class handling the action
            file_selection sys1;
            switch (input) {
                case "1": sys1 = new file_selection("decrypt");break;
                case "2": sys1 = new file_selection("display");break;
                case "3": System.exit(0);break;
            }

        }
    }}