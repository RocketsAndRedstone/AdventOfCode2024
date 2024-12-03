import java.io.*;
import java.util.*;
public class Day3{

    public static void main(String[] args) {
        try{
            int total = 0;
            File longString = new File("day3Input.txt");
            Scanner userData = new Scanner(longString);
            ArrayList<String> toFilter = new ArrayList<>();
            ArrayList<String> filteredInput = new ArrayList<>();
            while(userData.hasNext()){
                toFilter.add(userData.nextLine());
            }
            for(String s : toFilter){
                String tempString = s;
                int counter = 1;
                while(tempString.indexOf("mul(", counter) != -1){
                System.out.println((tempString.indexOf("mul(", counter)));
                 counter += tempString.indexOf("mul(", counter);
                }
                
                
                
            }
            userData.close();
        }

        catch(FileNotFoundException e){
            System.out.println("Something went wrong when reading in the file");
        }

    }

}