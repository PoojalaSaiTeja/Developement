package Inheritence;
import java.io.*;

public class encapsulation {
    public static void main(String[] args) {
        try {
            int[] a = {1,2,3,4};
            System.out.println(a[9]);
            readFile("abcd.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        } finally{
            System.out.println("nice job");
        }
    }
    static void readFile(String filename) throws IOException{
        FileReader file = new FileReader(filename);
        BufferedReader fileinput = new BufferedReader(file);
        fileinput.close();

    }

}
