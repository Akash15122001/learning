package Collections;

import java.util.*;
public class ArrayList_1d {
    public static Scanner sc=new Scanner(System.in);
    public ArrayList_1d(int s) {
         List<Integer> ar=new ArrayList<>();
         for(int i=0;i<s;i++){
             ar.add(sc.nextInt());
         }
         print_1DA(ar,s);
    }

    public void print_1DA(List<Integer> ar, int s) {
        for (int i=0;i<s;i++){
            System.out.print(ar.get(i)+" ");
        }
    }

    public static void main(String[] args){
        int s=sc.nextInt();
        new ArrayList_1d(s);
    }
}
