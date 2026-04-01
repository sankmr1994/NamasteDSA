package _05_linked_list;

public class _04_palindrome_linked_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(1);

        // find mid node
        MyLinkedList.Node slow = myLinkedList.head;
        MyLinkedList.Node fast = myLinkedList.head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        MyLinkedList.Node head2 = slow.next;
        MyLinkedList.Node head1 = myLinkedList.head;
        slow.next = null;

        //reverse head2
        MyLinkedList.Node current = head2;
        MyLinkedList.Node previous = null;
        while (current != null) {
            MyLinkedList.Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head2 = previous;
        boolean isPalindrome = true;
        while (head2 != null) {
            if (head1.val != head2.val) {
                isPalindrome = false;
                break;
            }
            head2 = head2.next;
            head1 = head1.next;
        }
        System.out.println("Is palindrome : " + isPalindrome);
    }
}
