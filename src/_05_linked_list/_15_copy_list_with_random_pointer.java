package _05_linked_list;

import java.util.HashMap;

public class _15_copy_list_with_random_pointer {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList.Node node1 = new MyLinkedList.Node(7);
        MyLinkedList.Node node2 = new MyLinkedList.Node(13);
        MyLinkedList.Node node3 = new MyLinkedList.Node(11);
        MyLinkedList.Node node4 = new MyLinkedList.Node(10);
        MyLinkedList.Node node5 = new MyLinkedList.Node(1);
        node1.next = node2;
        node1.random = null;

        node2.next = node3;
        node2.random = node1;

        node3.next = node4;
        node3.random = node5;

        node4.next = node5;
        node4.random = node3;

        node5.next = null;
        node5.random = node1;

        myLinkedList.head = node1;

        MyLinkedList.Node current = myLinkedList.head;
        while (current != null) {
            System.out.print(current.val + " random -> " + (current.random != null ? current.random.val : "Null") + " -> ");
            current = current.next;
        }
        System.out.println("null");

        current = myLinkedList.head;
        HashMap<Integer, MyLinkedList.Node> copyMap = new HashMap<>();
        while (current != null) {
            copyMap.put(current.val, new MyLinkedList.Node(current.val));
            current = current.next;
        }

        current = myLinkedList.head;
        MyLinkedList.Node copyList = new MyLinkedList.Node(-1);
        MyLinkedList.Node copyCurrent = copyList;
        while (current != null) {
            MyLinkedList.Node copyNode = copyMap.get(current.val);
            copyCurrent.next = copyNode;
            if (current.random != null) {
                copyNode.random = copyMap.get(current.random.val);
            }
            current = current.next;
            copyCurrent = copyCurrent.next;
        }

        myLinkedList.head = copyList.next;
        current = myLinkedList.head;
        while (current != null) {
            System.out.print(current.val + " random -> " + (current.random != null ? current.random.val : "Null") + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
