import java.util.*;
import java.io.*;
public class Day2 {
    public static void main(String[] args) {
        try{
            File grid = new File("day2Input.txt");
            Scanner userData = new Scanner(grid);
        }
        catch(FileNotFoundException e){
            System.out.println("Something is wrong with the given file name, path or something else related to the file");
        }
    }
}
