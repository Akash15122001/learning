package Java8;

import java.util.*;

public class MethodReference {
    public static void main(String[] args){
        List<String> s=Arrays.asList("akash","dhoni");
        s.forEach(System.out::println);
    }
}
