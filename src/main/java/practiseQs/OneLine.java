package practiseQs;

import java.util.*;
import java.util.regex.Pattern;

public class OneLine {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];

        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
            arr[i]=sc.useDelimiter("").nextInt();

        }
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
            System.out.println(arr[i]);
        }
    }
}
