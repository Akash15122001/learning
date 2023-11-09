package DSA;

import java.util.*;
public class Hashing {
    static Scanner sc=new Scanner(System.in);
    static int s=sc.nextInt();
    static  int[] ar=new int[s];

    public static void insert(int data){
        int k=data%s;
        int i=k;
        while (ar[i]!=-1){
            i=(i+1)%s;
            if(i==k){ //to check full condition make i=k
                System.out.println("Full");
                System.exit(0);
            }
        }
        ar[i]=data;
    }

    public static void search(int data){
        int k=data%s;
        int i=k;
        while(data!=ar[i]){
            i=(i+1)%s;
            if(i==k){
                System.out.println("not found");
                System.exit(0);
            }
        }
        if(data==ar[i]){
            System.out.println("found");
        }
    }

    public static void del(int data){
        int k=data%s;
        int i=k;
        while(data!=ar[i]){
            i=(i+1)%s;
            if(i==k){
                System.out.println("not found");
                System.exit(0);
            }
        }
        ar[i]=-1;
    }

    public static void main(String[] args){
        for (int i=0;i<s;i++){
            ar[i]=-1;
        }
        for (int i:ar) {
            System.out.print(i+" ");
        }
        System.out.println();
        int cond=s;
        while (cond>0){
            insert(sc.nextInt());
            cond--;
        }
        for (int j=0;j<s;j++) {
            System.out.println(ar[j]+" "+j);
        }
        int value=sc.nextInt();
        search(value);
        int dvalue=sc.nextInt();
        del(dvalue);
        for (int j=0;j<s;j++) {
            System.out.println(ar[j]+" "+j);
        }
    }
}
