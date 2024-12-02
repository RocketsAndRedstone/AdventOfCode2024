import java.io.*;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        try{
        //opens and reads file
        File grid = new File("day2Input.txt");
        Scanner userData = new Scanner(grid);
        ArrayList<String> row = new ArrayList<>();
        //converts file to ArrayList
        while(userData.hasNext()){
            String temp = userData.nextLine();
            row.add(temp);
        }
        int safeReports = 0;
        //loops through each row in the file and sets up variables that need to be reset at the start of each cycle
        for(int i = 0; i < row.size(); i++){
            String[] rowItem = (row.get(i)).split(" ");
            int differance = 0;
            boolean isSafe = false;
            boolean rising = true;
            //loops through each item in the row and sees if it meets the requierments to be considered safe
            for(int n = 0; n < (rowItem.length -1); n++){
                differance = Integer.parseInt(rowItem[n]) - Integer.parseInt(rowItem[n+1]);
                if(differance <0 && n ==0){
                    rising = false;
                }
                if(differance < 0 && n != 0 && rising == true){
                    isSafe = false;
                    break;
                }
                else if(differance > 0 && n != 0 && rising == false){
                    isSafe = false;
                    break;
                }
                if(differance == 0){
                    isSafe = false;
                    break;
                }
                if (differance > 3 && rising == true){
                    isSafe = false;
                    break;
                }
                else if(differance < -3 && rising == false){
                    isSafe = false;
                    break;
                }
                else{
                    isSafe = true;
                }
            }
            if (isSafe == true){
                safeReports ++;
            }


            
            

        }
        System.out.println("Safe Reports: " +safeReports);        
        userData.close();
    }
    catch(FileNotFoundException e){
        System.out.println("An error has ocoured with the file name or path");
    }
        
    }
}
