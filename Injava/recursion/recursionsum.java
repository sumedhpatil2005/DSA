public class recursionsum {

    int  sum(int n){
        if(n<1)return 0;
        
        return n +sum(n-1);



    }
    public static void main(String[] args) {
        int n=6;
        recursionsum c = new recursionsum();
       System.out.println( c.sum(n));

    }
}
