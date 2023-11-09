package Java8;
interface display{
    void show(int i);
}

class DisplayShow implements display{
    public void show(int i){
        System.out.println("display interface show method with passed int value"+i);
    }
}

public class DemoLambda{
    public static void main(String[] args){
        display a=new DisplayShow(); //(using refrence of interface and a class object)
        a.show(6);

        display b=new display() {
            @Override
            public void show(int i) {
                System.out.println("display interface show method with passed int value "+i); //(using inner class method)
            }
        };
        b.show(6);

        display c=i->System.out.println("display interface show method with passed int value"+i); //(shortform for of 2nd technique using lambda,removed boilerplate code)
        //display c=(int i)->System.out.println("display interface show method "+i);
        c.show(6);
    }
}
