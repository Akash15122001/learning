package Java8;

interface Phone{
    void call();
    default void message(){
        System.out.println("sent");
    }
}

class AndroidPhone implements Phone{
    public void call(){
        System.out.println("calling");
    }
    public void ring(){
        System.out.println("ring");
    }
}
public class DemoInterface /*extends AndroidPhone OR implements Phone*/{
//    @Override
//    public void call(){
//        System.out.println("calling");
//    }
    public static void main(String[] args){
        Phone p=new AndroidPhone(); // Instance of an interface, p is reference of interface and object of a class.
       // DemoInterface d=new DemoInterface(); //Instance of a class
        p.call();
        p.message();
//        AndroidPhone a=new AndroidPhone();
//        a.ring();
    }
}
