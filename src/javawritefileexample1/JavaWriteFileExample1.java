package javawritefileexample1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaWriteFileExample1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        File output = new File("capitals.txt"); // The file capitals.txt is created after program excuting
                                                // or it is written over already existed file capitals.txt
        String name;

        System.out.println("Please enter the first capital name: ");
        name = in.nextLine();

        try {
            PrintWriter out = new PrintWriter(output);
            
            while(name.equalsIgnoreCase("done")==false)
            {
                out.println(name);
                System.out.println("Please enter another capital name or \"done\" to exit");
                name=in.nextLine();
            }
            out.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not found exception!!!!");
            System.out.println(ex.toString());
        }
    }

}
