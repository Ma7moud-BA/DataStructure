import java.util.NoSuchElementException;

public class MyLinkedList {
    // since the Node should work under the hood inside the linkedlist we declare it
    // here and use it internally
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int item) {
        // using var keyword instead of write Node twice java compiler will detect the
        // type of Node
        var newNode = new Node(item);
        // if the linkedlist is empty we want to set the first and last node to point at
        // the this new node other wise append this new node the end of the list
        if (isEmpty()) {
            first = last = newNode;
        } else {
            // make the last node points at the new node then making the last node equals
            // the newNode because now its the last one
            last.next = newNode;
            last = newNode;
        }
    }

    public void addFirst(int item) {
        var newNode = new Node(item);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            // make the newNode point at the current first node, then make the first node of
            // the linkedlist the newNode
            newNode.next = first;
            first = newNode;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        // var current = first;
        // while (current != null) {
        // if (current.value == item)
        // return true;
        // current = current.next;
        // }
        // return false;
        // ? a better way to not repeat code
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            // if there is only one item
            first = last = null;
            return;
        }
        // if we delete the link immediatily without storing it in a variable we will
        // lose track of it
        var second = first.next;
        // delete the link so the garbage collector of java removes it from the memory
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            // if there is only one item
            first = last = null;
            return;
        }
        var previous = getPrevious(last);

        // Update 'last' to point to the previous node, effectively removing the last
        // node
        last = previous;

        // Set the 'next' reference of the new 'last' node to null
        // This detaches the former last node from the list
        last.next = null;
    }

    // Helper method to find the previous node before a given node
    private Node getPrevious(Node node) {
        var current = first; // Start from the first node

        while (current != null) {
            // Check if the 'next' reference of the current node is equal to the provided
            // 'node' node
            if (current.next == node)
                return current; // If yes, return the current node, which is the previous node.
            current = current.next; // Move to the next node if not found.
        }

        return null; // Return null if the node was not found in the list.
    }

}
