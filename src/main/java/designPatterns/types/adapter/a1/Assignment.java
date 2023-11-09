package designPatterns.types.adapter.a1;

public class Assignment {

    public void writeA(String s){
        p.write(s);
    }

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    private Pen p;

}
