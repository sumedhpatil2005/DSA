import java.io.*;

class reverse {
    public static void main(String[] args){
        
            String name = "sumedh";
            char arr[] = name.toCharArray();
            int i=0;
            int j = name.length()-i-1;

            while(i<name.length()/2){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                 j = name.length()-i-1;
            }
            System.out.println(arr);
    }
}