package Example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class SimpleFileWriteExample {
    public static void main(String[] args) {
        String relativePat = "out.txt";
        File file = new File(relativePat);
        try{
            String message1 = " sadasdasdasdas dasdas  ";
            String message2 = "as dasdasd asdasdasd  sadadasasdas";
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message1);
            bufferedWriter.newLine();
            bufferedWriter.write(message2);
            bufferedWriter.close();
        } catch (Exception e){

        }
    }
}
