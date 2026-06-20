import java.io.*;

class vowels{int count=0;
    public static void main(String[] args){
        
        String name = "sumedh";
        
            int count=0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch== 'i' || ch=='o' || ch== 'u'){

                System.out.println(name.charAt(i));
                
count++;
                

            }
        }
        System.out.println(count);

    }
}