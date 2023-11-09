package practiseQs;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {
    public static int fac(int n){
        /*if(n==0||n==1){
            return 1;
        }
        else
        {
            return n*fac(n-1);
        }*/

        return IntStream.rangeClosed(2,n).reduce(1, (x,y)->x*y);

        /*int r=1;
        while (n>0){
            r=r*n;
            n--;
        }
        return r;*/
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(fac(n));
    }

}
