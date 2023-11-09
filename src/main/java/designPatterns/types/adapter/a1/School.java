package designPatterns.types.adapter.a1;

public class School {
    public static void main(String[] agrs)
    {
        Pen p=new PenAdapter();
        Assignment assignment=new Assignment();
        assignment.setP(p);
        assignment.writeA("helow ");
    }
}
