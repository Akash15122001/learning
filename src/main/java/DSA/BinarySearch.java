package DSA;

import java.util.*;
public class BinarySearch {
    public static Scanner sc=new Scanner(System.in);
    public static boolean bSearch(int[] ar,int key){
        int start=0;
        int end=ar.length-1;
        int mid;
        boolean flag=false;
        while(start<=end){
            mid=(start+end)/2;
            if(key==ar[mid]){
                flag=true;
                break;
            }
            else if(ar[mid]<key){
               start=mid+1;
            }
            else
            {
               end=mid-1;
            }
        }
        return flag;
    }

    public void found(boolean flag){
        if(flag) System.out.printf("value found");
        else System.out.printf("not found");
    }

    public static void main(String[] args){
        BinarySearch b=new BinarySearch();
        int size=sc.nextInt();
        int [] ar=new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        System.out.println("enter the value to be searched");
        int key=sc.nextInt();
        b.found(bSearch(ar,key));
    }
}
