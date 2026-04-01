package _05_linked_list;

class MyLinkedList {

    Node head;

    Node tail;

    int size;



    static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int get(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return -1;
        }
        if (index == 0) {
            return head.val;
        }
        if (index == size - 1) {
            return tail.val;
        }
        Node temp = head;
        for (int nodeIndex = 1; nodeIndex <= index; nodeIndex++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        // create new node
        Node newNode = new Node(val);

        //Link the new node
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addAtTail(int val) {
        if (tail == null) {
            addAtHead(val);
        } else {
            //link new node
            tail.next = new Node(val);
            tail = tail.next;
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else {
            Node temp = head;
            for (int nodeIndex = 1; nodeIndex <= index - 1; nodeIndex++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            if (index == size) {
                tail = newNode;
            }
            size++;
        }

    }

    public void deleteAtIndex(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int nodeIndex = 1; nodeIndex <= index - 1; nodeIndex++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (index == size - 1) {
                tail = temp;
            }
        }
        size--;
    }

    public void makeCycle(int index) {
        if (index == 0) {
            tail.next = head;
        } else {
            Node current = head;
            for (int i = 1; i <= index; i++) {
                current = current.next;
            }
            tail.next = current;
        }
    }



    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
