package _05_linked_list;

public class _05_intersection_of_two_linked_lists {
    public static void main(String[] args) {
        MyLinkedList head1 = new MyLinkedList();
        head1.addAtTail(2);
        head1.addAtTail(6);
        head1.addAtTail(4);

        MyLinkedList head2 = new MyLinkedList();
        head2.addAtTail(1);
        head2.addAtTail(5);

        MyLinkedList head3 = new MyLinkedList();
        head3.addAtTail(5);
        head3.addAtTail(6);
        head3.addAtTail(7);

//        head1.tail.next = head3.head;
//        head2.tail.next = head3.head;

        MyLinkedList.Node current = head2.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head1.head;

        MyLinkedList.Node slow = head2.head;
        MyLinkedList.Node fast = head2.head;

        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
                break;
            }
        }

        System.out.println(isCycle ? "Intersect" : "Not Intersect");

        if (isCycle) {
            MyLinkedList.Node s1 = head2.head;
            while (s1 != slow) {
                s1 = s1.next;
                slow = slow.next;
            }
        }
        System.out.println("Intersection point is : " + slow.val);
    }
}
