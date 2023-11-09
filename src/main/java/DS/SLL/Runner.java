package DS.SLL;

public class Runner {
    public static void main(String[] args){
        Sll sll=new Sll();
        sll.insertS(0);
        sll.insert(2);
        sll.insert(4);
        sll.insert(6);
        sll.insertS(8);
        sll.insertAt(2,10);
        sll.delete(2);
        sll.show();
    }
}
