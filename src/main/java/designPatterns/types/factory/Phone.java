package designPatterns.types.factory;

import java.util.*;
public class Phone {
    public static void main(String[] args){
        /*OS os1=new Android();    normally if we have to change the android to ios then we have to cahnge it here and the client
        os1.specs();               will know what class we r workking on
        ;*/

        //instead of directly creating objects let the factory create objects for you.

        Scanner sc=new Scanner(System.in);
        Factory factory=new Factory();
        OS os=factory.getInstance(sc.nextLine());
        os.specs();
    }
}
