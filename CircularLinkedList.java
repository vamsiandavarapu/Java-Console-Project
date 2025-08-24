public class CircularLinkedList {
    Node tail;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void createLinkedList() {
        tail = null;
        size = 0;
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        size++;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void addAtPosition(int data, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else {
            Node current = tail.next;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }

    void display() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail.next;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data + " ");
    }

    void deleteFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1) {
            tail = null;
            size = 0;
            return;
        } else {
            tail.next = tail.next.next;
            size--;
        }

    }

    void deleteLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (size == 1) {
            tail = null;
            size = 0;
            return;
        } else {
            Node current = tail.next;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = tail.next;
            tail = current;
            size--;
        }
    }

    void deleteAtPosition(int position) {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            deleteFirst();
            return;
        }
        Node current = tail.next;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        if (current.next == tail) {
            tail = current;
        }
        current.next = current.next.next;
        size--;
    }

}
