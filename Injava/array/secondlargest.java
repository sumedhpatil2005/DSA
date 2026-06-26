package Injava.array;

public class secondlargest {
    public static void main(String[] args) {
        
    
    int arr[]={1,2,3,8,4,5,6,7};

    int largest= arr[0];
    int slarge=arr[0];

    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            
            largest=arr[i];

        }
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>slarge&&arr[i]<largest){
            slarge = arr[i];
        }
    }
    System.out.println(largest);
    System.out.println(slarge);
}
    
}
