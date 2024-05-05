package L8.FileExample;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        FileWriter writer = null;
        try{
            writer = new FileWriter("example.txt");
            writer.write("Hello World!!");
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            try{
                if( writer != null){
                    writer.close();
                }
            }catch (IOException e){
                System.out.println("An error occured while closing the file. ");
                e.printStackTrace();
            }
        }
    }
}
