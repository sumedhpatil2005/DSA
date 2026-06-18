import java.io.*;


class palindrome{
    public static void main(String[] args) {
        String m ="madam";
            int i=0;
            while(i<m.length()/2){
                if(m.charAt(i)!=m.charAt(m.length()-1-i)){
                    System.out.println("not a palindrome");
                    break;

                }
                else{
                    System.out.println("A palindrome");
                    i++;
                }
            
        }

    }
}