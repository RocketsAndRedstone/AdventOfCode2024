import java.io.*;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        try{
            File numbers = new File("day2Input.txt");
            Scanner userData = new Scanner(numbers);
            while(userData.hasNext()){
                String temp = userData.nextLine();
                System.out.println(temp);
            }
            userData.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Something is wrong with the given file name, path or something else related to the file");
        }
    }
}
