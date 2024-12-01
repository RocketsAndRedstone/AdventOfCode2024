import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try{
        //opens and reads the user file
        File numbers = new File("day1Input.txt");
        Scanner userFile = new Scanner(numbers);
        ArrayList<String> side1String = new ArrayList<>();
        ArrayList<String> side2String = new ArrayList<>();
        //loops through the inputed file and splits the 2 columns into seperate arry lists
        while(userFile.hasNext()){
            String temp = userFile.nextLine();
            String[] splitInput = temp.split("   ");
            side1String.add(splitInput[0]);
            side2String.add(splitInput[1]);
        
        }
        //converts the string lists to integer lists so that arithmatic operations can be performed
        ArrayList<Integer> side1Int = new ArrayList<>();
        ArrayList<Integer> side2Int = new ArrayList<>();
        for(int i = 0; i < side1String.size(); i++){
            side1Int.add(Integer.parseInt(side1String.get(i)));
        }
        for(int i = 0; i < side2String.size(); i++){
            side2Int.add(Integer.parseInt(side2String.get(i)));
        }
        //sorts the 2 sides so that we can compare the lowest values
        Collections.sort(side1Int);
        Collections.sort(side2Int);
        //solution to part 1
        //finds the differance between the 2 sortd sides and adds that differance to a total differance
        int difference;
        int totalDisplacement = 0;
        for(int i = 0; i < side1Int.size(); i++){
            if (side1Int.get(i) < side2Int.get(i)){
                difference = side2Int.get(i) - side1Int.get(i);
            }
            else{
                difference = side1Int.get(i) - side2Int.get(i);
            }
            totalDisplacement += difference;

        }
        System.out.println(totalDisplacement);

        //solution to part 2
        int simScore = 0;
        for (int i = 0; i < side1Int.size(); i++) {
            for (int n =0; n <side2Int.size(); n++){
                if (Objects.equals(side1Int.get(i), side2Int.get(n))){
                    simScore += side1Int.get(i);
                }
            }
            }
        System.out.println(simScore);
        
        userFile.close();
        }
        //used incase the file inputed does not exist or there is some other problem with the file
        catch(FileNotFoundException e){
            System.out.println("Incorect file name or file does not exist.");
        }
    }



}
