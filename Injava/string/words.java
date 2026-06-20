import java.io.*;

public class words{
    public static void main(String[] args) {
        String sentence = "I love pdf";

        int count=0;
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
             if(ch == ' ')
            {
                count++;
            }
        }
        System.out.println(count+1);
    }
}