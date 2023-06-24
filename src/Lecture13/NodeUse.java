package Lecture13;

public class NodeUse {
    public static void printLinkedList(Node head) {

        head.next = null;
        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node createRandomLinkedList(int size) {
        Node head = null;
        Node current = null;
        Node prev = null;
        while (size > 0) {
            current = new Node(size*10);
            current.next = prev;
            prev = current;
            size--;
        }
        head = prev;
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(4);
        Node node2 = new Node(6);
        Node head = node1;

        node1.next = node2;

        printLinkedList(head);
        System.out.println(head.data);
    }
}
