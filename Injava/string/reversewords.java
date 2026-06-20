public class reversewords {
    public static void main(String[] args) {
        String s = "I Love DSA";
        String f ="";
        String[] m = s.split(" ");
        System.out.println(m.length);
        String w ="" ;
        for(int i = m.length-1;i>=0;i--){
            w+=m[i]+" ";

            for(int j=m[i].length()-1;j>=0;j--){
                f +=m[i].charAt(j);

            }
            f += " ";
        }

        System.out.println(f);
    }
}
