package caesar_cipher;
import java.io.*;
import java.util.*;
public class decrypt {
    String ALPHABET = "abcdefghijklmnopqrstuvwxyz1234567890,.-";
    File input;
    File output;
    public decrypt(File file) throws Throwable{
        this.input = file;
        this.output = new File("decrypted_"+input.getName());
        decryptFile(input);
    }


    //creates a list of the paragraphs in input file.
    private ArrayList<String> paraList(File file) throws Throwable{
        ArrayList<String> paragraphs = new ArrayList<>();
        StringBuilder currentPara = new StringBuilder();

        Scanner sn = new Scanner(file);
        while (sn.hasNextLine()) {
            String line = sn.nextLine().toLowerCase();

            //checks for blank lines.
            if(line.trim().isEmpty()){
               //check if current paragraph has letters. we add it to list if it does and reset.
                if(!currentPara.isEmpty()) {
                    paragraphs.add(currentPara.toString());
                    currentPara.setLength(0);
                    //if line isnt blank. it adds it to current paragraph
                } } else
                 currentPara.append(line).append("\n")   ;

            }
            //catches last paragraph
            if(!currentPara.isEmpty())
                paragraphs.add(currentPara.toString());

        return paragraphs;
    }



    private void decryptFile(File file) throws Throwable{
        ArrayList<String> paragraphs = paraList(file);
        PrintWriter wr = new PrintWriter(output);

        //each paragraph is iterated over. and for every possible key decryptPara is called
        int counter = 1;
        for(String paragraph: paragraphs){
            wr.printf("paragraph #"+counter+" decryption\n----------------------------------------\n");

            // "for every possible key"
            for(int key = 0; key < ALPHABET.length(); key++){
                wr.print(decryptPara(paragraph, key));
                //displays key used.
                wr.println("key = "+ key+"\n");

            }
            wr.println("----------------------------------------");
            counter++;
        }
        wr.close();
        System.out.println("file decrypted");
    }

    private String decryptPara(String paragraph, int key) {
        StringBuilder sb = new StringBuilder();

        //loop through letters in paragraph
        for(int i = 0; i < paragraph.length(); i++){
        char c = paragraph.charAt(i);
        int aplhaIndex = ALPHABET.indexOf(c);

        //checks if c is in the alphabet
        if(aplhaIndex != -1){
            //eq to find new position.
            int numberOfShifts = (aplhaIndex - key) % ALPHABET.length();
            if(numberOfShifts < 0)
                numberOfShifts += ALPHABET.length();
            sb.append(ALPHABET.charAt(numberOfShifts));
        }
        else // c isnt in alphabet
            sb.append(c);

        }
        return sb.toString();
    }
    }


