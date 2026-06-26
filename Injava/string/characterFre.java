import java.util.HashMap;
import java.util.Scanner;

public class characterFre {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);

        for(int i=0;i<word.length();i++){
          char ch = word.charAt(i);
          if(map.get(ch)==1){
            System.out.println(ch);
         
          }
          


           
            
        }

    }   
}
