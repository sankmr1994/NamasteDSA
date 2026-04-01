package _05_linked_list;

public class _01_middle_of_linked_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);
        myLinkedList.addAtTail(6);

        MyLinkedList.Node slow = myLinkedList.head;
        MyLinkedList.Node fast = myLinkedList.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Mid is : " + slow.val);
    }
}
