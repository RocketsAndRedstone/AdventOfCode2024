import java.io.*;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        try{
        File grid = new File("day2Input.txt");
        Scanner userData = new Scanner(grid);
        while(userData.hasNext()){
            String temp = userData.nextLine();
            System.out.println(temp);
        }
        userData.close();
    }
    catch(FileNotFoundException e){
        System.out.println("An error has ocoured with the file name or path");
    }
        
    }
}
