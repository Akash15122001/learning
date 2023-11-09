package designPatterns.types.adapter.a2;

public class Adapter implements Charger{
    AndroidCharger androidCharger=new AndroidCharger();
    @Override
    public void charge(String s) {
        androidCharger.charges(s);
    }
}
