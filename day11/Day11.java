import java.util.*;
public class Day11{


    public static void main(String[] args) {
        //seperating inital number string into an arrayList
            String startString = "4329 385 0 1444386 600463 19 1 56615";
           String[] splitString = startString.split(" ");
            ArrayList<Long> seperateNum = new ArrayList<>();
           for(String s :splitString){
                seperateNum.add(Long.valueOf(s));
           } 
           //loop to controll how many times the stones blink, if the times run is changed to 75 for part 2, it will take weeks to complete
           //it semes to run in exponental time
          for(int i = 0; i < 25; i++){
                for(int n = 0; n < seperateNum.size(); n++){
                    //sets all 0 to 1
                    if(seperateNum.get(n) == 0){
                        long temp = 1;
                        seperateNum.set(n ,temp);
                    }
                    //seperates all even length numbers in half and adds both halfs back to the list
                    else if((seperateNum.get(n)+"").length() % 2 ==0){
                        String temp = "" + seperateNum.get(n);
                        String half1 = temp.substring(0,temp.length()/2);
                        String half2 = temp.substring(temp.length()/2);
                        seperateNum.set(n,Long.valueOf(half1));
                        seperateNum.add(n+1,Long.valueOf(half2));
                        n++;
                    }
                    //multiplies all other numbers by 2024
                    else{
                        long temp =seperateNum.get(n) * 2024;
                        seperateNum.set(n,temp);
                    }
                    
                }
                System.out.println(i);
          }
          System.out.println(seperateNum.size());

    }

}