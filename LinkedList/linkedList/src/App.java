public class App {
    public static void main(String[] args) {
        Node linkedList = new Node();
        linkedList.insertFirst(10);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertAtPos(1, 20);
        // linkedList.removeFirst();
        // linkedList.removeLast();
        System.out.println("Fount at: " + linkedList.search(40));
        // linkedList.reverse();
        linkedList.print();
    }
}
