public class App {
    public static void main(String[] args) {
        ArrayQueueType queue1 = new ArrayQueueType(5);
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);
        queue1.dequeue(); // element 10 should be removed because FiFO

        queue1.enqueue(60);// it wont be added because the size is 5
        queue1.printQueue();
        int front = queue1.getFrontQueue();
        int rear = queue1.getRearQueue();
        System.out.println("front: " + front);
        System.out.println("front: " + rear);
        int foundItem = queue1.search(60); // if -1 means it doesn't exist
        System.out.println("fountItem: " + foundItem);

    }
}
