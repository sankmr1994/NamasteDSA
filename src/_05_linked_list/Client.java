package _05_linked_list;

public class Client {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(0);
        myLinkedList.printLL();
        myLinkedList.addAtIndex(1, 4);
        myLinkedList.printLL();
        myLinkedList.addAtTail(8);
        myLinkedList.printLL();
        myLinkedList.addAtHead(5);
        myLinkedList.printLL();
        myLinkedList.addAtIndex(4, 5);
        myLinkedList.printLL();
        myLinkedList.addAtTail(0);
        myLinkedList.printLL();
        myLinkedList.addAtTail(5);
        myLinkedList.printLL();
        myLinkedList.addAtIndex(6, 3);
        myLinkedList.printLL();
        myLinkedList.deleteAtIndex(7);
        myLinkedList.printLL();
        myLinkedList.deleteAtIndex(5);
        myLinkedList.printLL();
        System.out.println("Tail "+ myLinkedList.tail.val);
        myLinkedList.addAtTail(4);
        myLinkedList.printLL();

    }
}
