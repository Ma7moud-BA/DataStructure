import java.util.Arrays;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        // NodeTest linkedList = new NodeTest();
        // linkedList.insertFirst(10);
        // linkedList.insertLast(30);
        // linkedList.insertLast(40);
        // linkedList.insertAtPos(1, 20);
        // // linkedList.removeFirst();
        // // linkedList.removeLast();
        // System.out.println("Fount at: " + linkedList.search(40));
        // // linkedList.reverse();
        // linkedList.print();

        // ? programming with mosh vid
        // ! built in Linked list
        // LinkedList<Integer> list = new LinkedList();
        // list.addLast(10);
        // list.addLast(20);
        // list.addLast(30);
        // list.addFirst(5);
        // list.removeLast();
        // System.out.println(list.contains(10));
        // System.out.println(list.size());
        // var array = list.toArray();
        // System.out.println("as array: " + Arrays.toString(array));
        // System.out.println("as Linkedlist: " + list);
        var list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.contains(30));
    }
}
