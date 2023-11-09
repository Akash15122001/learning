package Collections;

import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String in=sc.nextLine();
        HashMap<Character,Integer> keypad=new HashMap<>(){{
            put('a',1);put('b',1);
            put('c',2);put('d',2);put('e',2);
            put('f',3);put('g',3);put('h',3);
            put('i',4);put('j',4);put('k',4);
            put('l',5);put('m',5);put('n',5);
            put('o',6);put('p',6);put('q',6);
            put('r',7);put('s',7);put('t',7);
            put('u',8);put('v',8);put('w',8);
            put('x',9);put('y',9);put('z',9);
        }};
        Integer r=0;
        for(int i=0;i<in.length();i++){
            Character v=in.charAt(i);
            Integer a=keypad.get(v);
            r=r+a;
        }
    }
}
