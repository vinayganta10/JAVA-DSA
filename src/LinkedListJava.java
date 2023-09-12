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
        System.out.println("Linked List-------");
        Node temp = list.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static LinkedListJava deleteByKey(LinkedListJava list,int data){
        Node temp = list.head;
        Node prev = null;

        //case1
        if(temp!=null && temp.data==data){
            list.head = temp.next;
            System.out.println(data+" found and deleted");
            return list;
        }

        while(temp != null && temp.data!=data){
            prev = temp;
            temp = temp.next;
        }

        if(temp != null){
            prev.next = temp.next;
            System.out.println(data + " found and deleted");
        }

        if(temp == null){
            System.out.println(data + " not found");
        }
        return list;
    }

    public static LinkedListJava deleteByPos(LinkedListJava list,int pos){
        Node temp = list.head,prev=null;
        if(temp!=null && pos==0){
            list.head = temp.next;
            return list;
        }
        int counter = 0;
        while(temp!=null){
            if(pos==counter){
                prev.next=temp.next;
                System.out.println("found and deleted at " + pos + " position");
                break;
            }
            else {
                prev = temp;
                temp = temp.next;
                counter++;
            }
        }
        if(temp==null){
            System.out.println("Not found element at " + pos + " position");
        }
        return list;
    }


    public static void main(String[] args) {
        LinkedListJava list = new LinkedListJava();
        display(list);
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        list = insert(list,6);
        display(list);
        list = deleteByKey(list,1);
        display(list);
        list = deleteByKey(list,3);
        display(list);
        list = deleteByPos(list,1);
        display(list);
        list = deleteByPos(list,0);
        display(list);
        list = insert(list,7);
        display(list);
    }
}
