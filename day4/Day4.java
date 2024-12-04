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
            for(int i =0; i <toSearch.size(); i++){
                String row = toSearch.get(i);
                for(int n = 0; n < row.length() -2; n++){
                if(row.charAt(n) == 'X' && row.charAt(n+1) == 'M' && row.charAt(n+2) == 'A' && row.charAt(n+3) == 'S'){
                    xmasCounter ++;
                }
            }
            }
        


            System.out.println("Counter "+xmasCounter);
            
    
            userInput.close();
    }
    catch(FileNotFoundException e){
        System.out.println("An error has ocoured when attempting to open the file");
    }
    }
}