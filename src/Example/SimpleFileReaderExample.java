package Example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class SimpleFileReaderExample {
    public static void main(String[] args) {
        String absolutPath = "C:\\Users\\Albert\\Folder Proiect\\MySDEMovies\\movies.txt";
        String relativePath = "movie.txt";


        File file = new File(absolutPath);
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());

        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ( line != null){
                System.out.println();
                line = bufferedReader.readLine();
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
