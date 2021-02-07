package datareader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LearnDataReader {

    public static void main(String[] args) throws FileNotFoundException {
        LearnDataReader.readData();
    }

    public static void readData() throws FileNotFoundException {
        FileReader fileReader=null;
        BufferedReader bufferedReader =null;

        String filePath="../APracticeByYourSelf/Data Test/Sample.txt";

        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;

            while (     (data = bufferedReader.readLine()         ) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException e){
                System.out.println("File not found exception");

        } catch (IOException e) {
            e.printStackTrace();
        } finally{
                try {
                    fileReader.close();
                    bufferedReader.close();
                } catch (Exception e){
                    System.out.println("File Already closed");

                }
            }



    }
}
