package Collections;

import java.util.*;
public class ArrayList_2d {
    public static Scanner sc=new Scanner (System.in);

    public static List<List<Integer>> array(int r,int c){
        List<List<Integer>> ar=new ArrayList<>();
        for(int i=0;i<r;i++){
            ar.add(new ArrayList<>());
            for(int j=0;j<c;j++){
                ar.get(i).add(sc.nextInt());
            }
        }
        return ar;
    }
    public static void printArray(List<List<Integer>> ar,int r,int c){
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(ar.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int r=sc.nextInt();
        int c=sc.nextInt();
        List<List<Integer>> ar=array(r,c);
        printArray(ar,r,c);
    }
}
