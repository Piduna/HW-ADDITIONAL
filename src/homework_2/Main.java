package homework_2;

import java.io.*;
import java.util.*;

/**
 * Created by Valeriu on 12.08.2015.
 */
public class Main {

    //where i hear about that method
    //https://en.wikipedia.org/wiki/Bubble_sort
    //why public & static ? because i put that method int
    //next write_read_write
    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    //method write_read_write
    public void write_read_write () throws IOException {

        //make file
        FileWriter fw = new FileWriter("homework_2_1.txt");
        //our mass
        int first[] = new int[10];

        //random mass in file
        for (int i = 0; i < first.length; i++) {
            first[i] = (int)(Math.random()*100);
            fw.write(first[i] + " ");
        }
        fw.close();

        //scan our file
        Scanner sc = new Scanner(new File("homework_2_1.txt"));
        //scan with method nextLine
        String line = sc.nextLine();
        //separator " "
        String[] temp = line.split(" ");
        //make int mass, where we get length of String mass numbers
        int second[] = new int[temp.length];
        //get our own mass
        for(int i=0;i<temp.length;i++) {
            //parse our array of Int
            second[i] = Integer.parseInt(temp[i]);
        }

        //method bubbleSort
        //we can use Arrays.sort() too, for that example
        bubbleSort(second);

        //make file with new info
        FileWriter fw2 = new FileWriter("homework_2_2.txt");
        //write our bubbleSort mass in file
        for (int i = 0; i < second.length; i++) {
            fw2.write(second[i] + " ");
        }
        fw2.close();

    }

    public static void main(String[] args) throws IOException {

        //create object
        Main m = new Main();
        //call our method
        m.write_read_write();

    }
}