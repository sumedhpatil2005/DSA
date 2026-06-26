package Injava.array;

import java.util.HashMap;

public class frequency {

    public static void main(String[] args) {
        int arr[]={1,2,1,2,4,5,3,2,};

        HashMap<Integer,Integer> map = new HashMap();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
    
}
