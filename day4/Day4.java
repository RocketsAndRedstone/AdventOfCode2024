import java.io.*;
import java.util.*;

public class Day4{
    public static void main(String[] args) {
        try{
            File wrdSearch = new File("day4Input.txt");
            Scanner userInput = new Scanner(wrdSearch);
            ArrayList<String> toSearch = new ArrayList<>();
            int xmasCounter = 0;
            while(userInput.hasNext()){
                toSearch.add(userInput.nextLine());
            }
            for(String s : toSearch){
                System.out.println(s);
            }
            
    
            userInput.close();
    }
    catch(FileNotFoundException e){
        System.out.println("An error has ocoured when attempting to open the file");
    }
    }
}