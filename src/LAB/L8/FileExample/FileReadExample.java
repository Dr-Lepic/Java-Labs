package L8.FileExample;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }finally {
            try{
                if(reader != null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println("An error occurred while closing the file.");
                e.printStackTrace();
            }
        }
    }

}
