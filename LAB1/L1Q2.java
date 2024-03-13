import java.io.*;

public class L1Q2 {
    public static void main(String[] args){
        text1("text1.txt");
        text2("text2.txt");
        text3("text3.txt");
        text4("text4.txt");
    }

    public static void text1(String file){
        System.out.println("TEXT 1");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            int numCharc = 0;
            while(true){
                String line = reader.readLine();
                if(line == null)
                    break;
                String[] parts = line.split(",");
                for(String part : parts){
                    System.out.print(part); 
                    numCharc++;  
                }
                System.out.println();
            }
            System.out.println("Number of Character: " + numCharc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void text2(String file){
        System.out.println();
        System.out.println("TEXT 2");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            int numCharc = 0;
            while(true){
                String line = reader.readLine();
                if(line == null)
                    break;
                String[] parts = line.split(", ");
                for(String part : parts){
                    System.out.print(part);
                    numCharc++;
                    System.out.println();
                }
            }
            System.out.println("Number of Character: " + numCharc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void text3(String file){
        System.out.println();
        System.out.println("TEXT 3");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            int numCharc = 0;
            while(true){
                String line = reader.readLine();
                if(line == null)
                    break;
                String[] parts = line.split("; ");
                for(String part : parts){
                    System.out.print(part);
                    numCharc++;
                    System.out.println();
                }
            }
            System.out.println("Number of Character: " + numCharc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void text4(String file){
        System.out.println();
        System.out.println("TEXT 4");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            int numCharc = 0;
            String line = reader.readLine();
            String str = "";
            for(int i = 0; i < line.length(); i++){
                numCharc++;
                char ch = line.charAt(i);
                if('a' <= ch && ch <= 'z')
                    str += ch;
            }
            System.out.println(str);
            System.out.println("Number of Character: " + numCharc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
