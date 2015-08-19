package homework_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Valeriu on 12.08.2015.
 */
public class Main {

    //where i hear about that
    //http://docs.oracle.com/javase/7/docs/api/java/util/StringTokenizer.html
    //http://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
    public static String uppercase(String s){
        //call method
        StringTokenizer token = new StringTokenizer(s);
        StringBuffer buffer= new StringBuffer();

        //if we have more tokens
        while(token.hasMoreTokens()){
            String tok=token.nextToken();
            //if our string > 2, upper case all word
            //" " - this is a separator
            if(tok.length()>2){
                buffer.append(tok.toUpperCase()+" ");
            } else{
                buffer.append(tok+" ");
            }
        }
        return buffer.toString();
    }

    //filereader need IOException
    public static void main(String [] Args)throws IOException {

        //read file
        FileReader readFile = new FileReader("homework_1.txt");
        BufferedReader readFileInput = new BufferedReader(readFile);
        String textLine = readFileInput.readLine();
        //call static method uppercase
        System.out.println(uppercase(textLine));
        //close all streams
        readFile.close();
        readFileInput.close();

    }
}
