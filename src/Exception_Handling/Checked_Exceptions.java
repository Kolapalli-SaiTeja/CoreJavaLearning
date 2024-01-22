package src.Exception_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_Exceptions {

    public static void main(String[] args) throws Throwable {






        File file = new File("C:\\Users\\Lycan\\Desktop\\ad\\doom1.txt");

            FileReader fr = new FileReader(file);



        System.out.println("wdw");


    }

}
