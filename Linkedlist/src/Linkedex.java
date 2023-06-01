class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Inserted: " + data);
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Deleted: " + data);
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Element not found.");
        } else {
            previous.next = current.next;
            System.out.println("Deleted: " + data);
        }
    }

    public void search(int data) {
        Node current = head;
        int index = 0;
        boolean found = false;

        while (current != null) {
            if (current.data == data) {
                found = true;
                break;
            }
            current = current.next;
            index++;
        }

        if (found) {
            System.out.println("Element " + data + " found at index " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Linkedex {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.display();

        linkedList.delete(20);
        linkedList.display();

        linkedList.search(10);
        linkedList.search(40);
    }
}