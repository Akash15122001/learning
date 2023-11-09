package Interface;

public class Vehicles implements Motors {
    public void method(){
        System.out.println("a class which implements the interface defines the code for interface methods and is executed when called");
    }
}
class Bikes{
    static Motors m=new Vehicles();
    public static void main(String args[]){
        m.method();
    }
}
