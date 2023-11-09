package Java8;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args){
        int[] a={1,2,3,4};
        Arrays.stream(a).filter(n-> n%2==0).forEach(System.out::println);
    }
}
