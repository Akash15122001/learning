package DS.SLL;

public class Sll {
    Node head;
    public void insert(int d){
        Node node=new Node();
        node.data=d;
        node.next= null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public void insertS(int d){
        Node node=new Node();
        node.data=d;
        node.next=head;
        head=node;
    }

    public void insertAt(int index,int d){
        Node node=new Node();
        node.data=d;
        if(index==0){
            insertS(d);
        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }

    }

    public void delete(int index){
        if(index==0){
            head=head.next;
        }
        else{
            Node n=head;
            Node n1;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            //or
            /*Node node=head;
            for(int i=0;i<index-1;i++){
                node=node.next;
            }
            for(int i=0;i<index;i++){
                n=n.next;
            }
            node.next=n.next;*/
        }

    }
    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }

}
