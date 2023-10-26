package LinkedList;

public class Insert {
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next = null;

        }


    }

    public void addFirst(String data){
        
        Node newNode = new Node(data);
         
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }


    public static void main(String[] args) {
        Insert list = new Insert();
        list.addFirst("a");
        list.addFirst("is");
    }
}
