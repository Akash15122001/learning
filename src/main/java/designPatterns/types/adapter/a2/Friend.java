package designPatterns.types.adapter.a2;

public class Friend {
    public void setC(Charger c) {
        this.c = c;
    }

    private Charger c;

    public void help(String s){
        c.charge(s);
    }

}
