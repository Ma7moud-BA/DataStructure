public class Node {
    private int item;
    Node first;
    Node last;
    Node next;
    private int length;

    public Node() {
        first = null;
        last = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void insertFirst(int element) {
        Node newNode = new Node();
        newNode.item = element;
        if (length == 0) {
            first = newNode;
            last = newNode;
            newNode.next = null;
        } else {
            newNode.next = first;
            first = newNode;
        }
        length++;
    }

    public void insertLast(int element) {
        Node newNode = new Node();
        newNode.item = element;
        if (length == 0) {
            first = newNode;
            last = newNode;
            newNode.next = null;
        } else {
            last.next = newNode;
            newNode.next = null;
            last = newNode;
        }
        length++;
    }

    public void insertAtPos(int pos, int element) {
        if (pos < 0 || pos > length) {
            System.out.println(" out of range");
        } else {
            Node newNode = new Node();
            newNode.item = element;
            if (pos == 0) {
                insertFirst(element);
            } else if (pos == length) {
                insertLast(element);
            } else {
                Node Cur = first;
                for (int i = 1; i < pos; i++) {
                    Cur = Cur.next;
                }
                newNode.next = Cur.next;
                Cur.next = newNode;
                length++;
            }

        }
    }

    public void print() {
        Node Cur = first;
        while (Cur != null) {
            System.out.println(Cur.item + " ");
            Cur = Cur.next;
        }
    }

    public void removeFirst() {
        if (length == 0) {
            System.out.println("Empty list can't remove");
        } else if (length == 1) {
            last = first = null;
            length = length - 1;
        } else {
            first = first.next;
            length = length - 1;
        }
    }

    public void removeLast() {
        if (length == 0) {
            System.out.println("Empty list can't remove");
        } else if (length == 1) {
            first = last = null;
            length = 0;
        } else {
            Node current = first;
            while (current.next != last) {
                current = current.next;
            }
            current.next = null;
            last = current;
            length--;
        }
    }

    public void reverse() {
        Node prev, next, current;
        prev = null;
        current = first;
        next = current.next;
        while (next != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            first = prev;

        }

    }

    public int search(int element) {
        Node current = first;
        int pos = 0;
        while (current != null) {
            if (current.item == element) {
                return pos;
            }
            current = current.next;
            pos = pos + 1;
        }
        return -1; // Element not found in the list
    }

}
