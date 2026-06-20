import java.util.*;
public class validdrome {

    public static void main(String[] args) {
        String one = "listen";
        String two = "sile nt";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer>map2 = new HashMap<>();
        for (int i =0;i<one.length();i++){
            char ch = one.charAt(i);
            char bh = two.charAt(i);

            map1.put(ch,map1.getOrDefault(ch,0)+1);
            map2.put(bh,map2.getOrDefault(bh,0)+1);


        }
        if(map1.equals(map2)){
            System.out.println("its a valid anagram");
        }
        else{
            System.out.println("it not a valid anagram");
        }
    }
    
}
