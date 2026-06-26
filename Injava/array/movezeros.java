package Injava.array;

public class movezeros {
    public static void main(String[] args) {
        
        int arr[]={1,0,2,0,4,5,6,0};

        int one=0;
        int second =0;
        int temp=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
              arr[second]=arr[i];
                second ++;
            }
        }
          
            for(int i=second;i<arr.length;i++){
                arr[i]=0;
            }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
