package Java8;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {
    public static void main(String[] args){
        int[] a1={1,2};
        List<Integer> a2=Arrays.asList(3,4);

        Arrays.stream(a1).forEach(i->System.out.println(i));

        a2.stream().forEach(i->System.out.println(i));
        a2.forEach(i->System.out.println(i));
    }

}
