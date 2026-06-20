import java.util.HashSet;

public class removedup {

    public static void main(String[] args) {
        String name =" banana";
        String answer = "";
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(set.contains(ch)){


            }
            else{
                set.add(ch);
                answer+=ch;
            }
        }
        System.out.println(answer);
    }
    
}
