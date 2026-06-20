import java.io.*;

public class occu{
    public static void main(String[] args){
        String word = "susssuufm";
        char target = 's';
        int count =0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch == target){
                count++;
            }
        }
        System.out.println(count);
    }
}