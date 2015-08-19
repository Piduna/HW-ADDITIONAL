package homework_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Valeriu on 14.08.2015.
 */
public class Main {

    public static void main(String args[]) throws IOException {

        //str for char && string. type for other primitive types
        String str, type = "null";
        //call arraylist for make list with integer, double
        //string, and char. char && string - one type of list
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> dobList = new ArrayList<Double>();
        ArrayList<String> charList = new ArrayList<String>();
        ArrayList<String> strList = new ArrayList<String>();

        //write new file homework_3.txt
        FileWriter fw = new FileWriter("homework_3.txt");
        fw.write("Test ABC 10 12,2 one c b m");
        fw.close();

        System.out.println("Enter your own type: char, int, double, string");

        //select your type
        Scanner scin = new Scanner(System.in);
        if(scin.hasNext())
            type = scin.nextLine();

        //read file
        FileReader fr = new FileReader("homework_3.txt");
        Scanner sc = new Scanner(fr);

        //use scanner for scan that file
        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                intList.add(sc.nextInt());
            } else if(sc.hasNextDouble()) {
                dobList.add(sc.nextDouble());
            } else {
                str = sc.next();
                //if str == 1. it is a char
                if(str.length() == 1) {
                    charList.add(str);
                } else {
                    strList.add(str);
                }
            }
            fr.close();
        }

        //ignore case of input type
        if(type.equalsIgnoreCase("int")) {
            System.out.println(intList);
        } else if (type.equalsIgnoreCase("double")) {
            System.out.println(dobList);
        } else if (type.equalsIgnoreCase("char")) {
            System.out.println(charList);
        } else if (type.equalsIgnoreCase("string")) {
            System.out.println(strList);
        }

    }
}