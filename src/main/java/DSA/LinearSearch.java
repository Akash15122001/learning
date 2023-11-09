package DSA;
import java.util.*;
public class LinearSearch {
    public static void lSearch(int key,int[] ar){
        BinarySearch ba=new BinarySearch();
        boolean flag=false;
        for (int i=0;i<ar.length;i++){
            if (key==ar[i]){
                flag=true;
            }
        }
        ba.found(flag);
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[] ar=new int[s];
        for (int i=0;i<s;i++){
            ar[i]=sc.nextInt();
        }
        int key= sc.nextInt();
        lSearch(key,ar);
    }
}
