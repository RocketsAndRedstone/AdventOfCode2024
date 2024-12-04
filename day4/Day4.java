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
            for(int i = 0; i < toSearch.size()-3; i ++){
                String row1 = toSearch.get(i);
                String row2 = toSearch.get(i+1);
                String row3 = toSearch.get(i+2);
                String row4 = toSearch.get(i+3);
                for(int n = 0; n < row1.length(); n++){
                    if(row1.charAt(n) == 'X' && row2.charAt(n) == 'M' && row3.charAt(n) == 'A' && row4.charAt(n) == 'S'){
                        xmasCounter ++;
                    }
                    else if(row1.charAt(n) == 'S' && row2.charAt(n) == 'A' && row3.charAt(n) == 'M' && row4.charAt(n) == 'X'){
                        xmasCounter ++;
                    }
                }
            }

            for(int i = 0; i < toSearch.size()-3; i++){
                String row1 = toSearch.get(i);
                String row2 = toSearch.get(i+1);
                String row3 = toSearch.get(i+2);
                String row4 = toSearch.get(i+3);
                for(int n = 0; n < row1.length()-3; n++){
                    if(row1.charAt(n) == 'X' && row2.charAt(n+1) == 'M' && row3.charAt(n+2) == 'A' && row4.charAt(n+3) == 'S'){
                        xmasCounter ++;
                    }
                    else if(row1.charAt(n) == 'S' && row2.charAt(n+1) == 'A' && row3.charAt(n+2) == 'M' && row4.charAt(n+3) == 'X'){
                        xmasCounter ++;
                    }
                    if(row1.charAt(row1.length() -1) == 'S' && row2.charAt(row1.length() -2) == 'A' && row3.charAt(row1.length() -3) == 'M' && row4.charAt(row1.length() -4) == 'X'){
                        xmasCounter ++;
                    }
                    else if(row1.charAt(row1.length() -1) == 'X' && row2.charAt(row1.length() -2) == 'M' && row3.charAt(row1.length() -3) == 'A' && row4.charAt(row1.length() -4) == 'S'){
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