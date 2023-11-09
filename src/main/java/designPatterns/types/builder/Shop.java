package designPatterns.types.builder;

public class Shop {
    public static void main(String[] args){
        /*Phone p=new Phone(8,"SnapDragon","ANDROID",6000); normally,we have to remember the order
        System.out.println(p);*/

        Phone p=new PhoneBuilder().setOs("android").setBattery(5000).getPhone();
        System.out.println(p);
    }
}
