import java.io.*;
import java.util.*;

public class ReadMyletter_23005006 {
    public static void main(String[] args) {
        String file = "yana_23005006.txt";
        System.out.println();

        // // part 1
        // try(BufferedReader reader = new BufferedReader(new FileReader(file))){
        //     String line = "";
        //     while((line = reader.readLine()) != null){
        //         System.out.println(line);
        //     }
        // }catch(Exception e){
        //     e.printStackTrace();
        // }

        // part 2
        Scanner sc = new Scanner(System.in);
        System.out.println("\nThursday, 18 June 2021");
        System.out.println("Describe the second part of the letter: ");
        String text = sc.nextLine();

        try(PrintWriter writer = new PrintWriter(new FileOutputStream(file, true))){
            writer.write("\n\nThursday, 18 June 2021\n");
            writer.write(text);
            System.out.println("\nText has been successfully stored.\n");
        }catch(Exception e){
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = "";
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        sc.close();
    }
    
}

