package _05_linked_list;

public class _09_remove_duplicates_from_sorted_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtTail(3);

        MyLinkedList.Node sential = new MyLinkedList.Node(-1);
        sential.next = myLinkedList.head;
        MyLinkedList.Node previous = sential;
        MyLinkedList.Node current = myLinkedList.head;

        while (current != null){
            if (previous.val == current.val){
                previous.next = previous.next.next;
            }else{
                previous = previous.next;
            }
            current = current.next;
        }
        myLinkedList.head = sential.next;
        myLinkedList.printLL();
    }
}
