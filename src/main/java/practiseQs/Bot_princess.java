package practiseQs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bot_princess {
    public static void displayPathtoPrincess(int n,char[][] grid){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        if(grid[0][0]=='p'){
            System.out.println("UP");
            System.out.println("LEFT");
        }
        if(grid[0][n-1]=='p'){
            System.out.println("UP");
            System.out.println("RIGHT");
        }
        if(grid[n-1][0]=='p'){
            System.out.println("DOWN");
            System.out.println("LEFT");
        }
        if(grid[n-1][n-1]=='p'){
            System.out.println("DOWN");
            System.out.println("RIGHT");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        //Pattern pattern = Pattern.compile("[-mp\n]");
        char[][] grid=new char[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                //System.out.print(i+" "+j+"\n");
                grid[i][j]=sc.useDelimiter("").next().charAt(0);

            }
        }
        sc.close();
        displayPathtoPrincess(n,grid);
    }
}
