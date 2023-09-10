public class LinkedListJava {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static LinkedListJava insert(LinkedListJava list,int data){
        Node newNode = new Node(data);

        if(list.head==null){
            list.head = newNode;
        }
        else{
            Node temp = list.head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return list;
    }

    public static void display(LinkedListJava list){
        Node temp = list.head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListJava list = new LinkedListJava();

        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);

        display(list);
    }
}
