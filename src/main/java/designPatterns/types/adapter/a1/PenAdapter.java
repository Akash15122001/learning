package designPatterns.types.adapter.a1;

public class PenAdapter implements Pen{
    PilotPen pp=new PilotPen();
    @Override
    public void write(String s) {
        pp.display(s);
    }

    //using pilot pen implemaentation in pen interface using adapter.
}
