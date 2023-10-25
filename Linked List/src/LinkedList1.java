class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
class LinkedList {
    Node head;
    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }
    void middleNode(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    boolean detectLoop(){
        Node slow=head;
        Node fast=head;
        int temp=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}


class LinkedList1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

//        System.out.println("Original list:");
//        list.print();

//        list.reverse();
//
//        System.out.println("Reversed list:");
//        list.print();
        //list.middleNode();
//        Node a=new Node(1);
//        Node b=new Node(2);
//        Node c=new Node(3);
//        Node d=new Node(4);
//        Node e=new Node(5);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        e.next=c;
        //list.head.next.next.next.next.next=list.head;
        if(list.detectLoop()){
            System.out.println("List contain a loop");
        }
        else{
            System.out.println("List okay");
        }
    }
}
