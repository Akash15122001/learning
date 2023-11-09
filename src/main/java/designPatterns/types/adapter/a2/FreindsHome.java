package designPatterns.types.adapter.a2;

public class FreindsHome {
    public static void main(String[] args){
        Charger a=new Adapter();
        Friend f=new Friend();
        f.setC(a);
        f.help("charge");
    }
}
