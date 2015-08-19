package homework_4;

import java.io.*;

/**
 * Created by Valeriu on 18.08.2015.
 */
public class Main {

    //our method
    public static void filter(Reader mails, Reader groups, Writer users) throws IOException {

        //read file homework_4_1.txt
        BufferedReader brm = new BufferedReader(mails);
        //read file homework_4_2.txt
        BufferedReader brg = new BufferedReader(groups);
        //write file homework_4_3.txt
        BufferedWriter bru = new BufferedWriter(users);

        //read string homework_4_1 & homework_4_2
        String m = brm.readLine();
        String g = brg.readLine();

        //if homework_4_1 & homework_4_2 does not null
        while (m != null && g != null) {
            //if homework_4_1 & homework_4_2 contains symbol "#"
            if (!m.contains("#") && !g.contains("#")) {
                //write homework_4_1 & homework_4_2 second field in homework_4_3
                bru.write(m + ";" + g.split(";")[1] + "\n");
            }
            m = brm.readLine();
            g = brg.readLine();
        }
        bru.flush();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException{

            //read file homework_4_1.txt
            FileReader frm = new FileReader("homework_4_1.txt");
            //read file homework_4_2.txt
            FileReader frg = new FileReader("homework_4_2.txt");
            //write file homework_4_3.txt
            FileWriter fwu = new FileWriter("homework_4_3.txt");

            //call static method filter
            filter(frm, frg, fwu);

            //close streams
            frm.close();
            frg.close();
            fwu.close();

    }

}




