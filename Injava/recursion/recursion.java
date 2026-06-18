import java.io.*;


class recursion {

    void recfun(int n){
        if(n<1) return;
        System.out.println(n);
         recfun(n-1);

    }
    public static void main(String[] args) {
        
       int n = 6;

       recursion r =  new recursion();
       r.recfun(n);
        
    }
}