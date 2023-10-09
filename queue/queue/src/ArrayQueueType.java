public class ArrayQueueType {
    private int MAX_SIZE = 100;
    private int rear;
    private int front;
    private int count;
    private int[] arr;

    public ArrayQueueType(int size) {
        if (size < 0) {
            this.MAX_SIZE = 100;
        } else {
            this.MAX_SIZE = size;
        }
        this.arr = new int[MAX_SIZE];
        front = 0;
        rear = MAX_SIZE - 1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == MAX_SIZE;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full on enqueue ...!");
        } else {
            rear = (rear + 1) % MAX_SIZE;
            arr[rear] = element;
            count++;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty on dequeue ...!");
        } else {
            front = (front + 1) % MAX_SIZE;
            count--;

        }
    }

    public int getFrontQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty !");
            return 0;
        } else {
            return arr[front];
        }
    }

    public int getRearQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty !");
            return 0;
        } else {
            return arr[rear];
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty !");

        } else {
            for (int i = front; i != rear; i = (i + 1) % MAX_SIZE) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[rear]);
        }

    }

    public int search(int element) {
        int pos = -1;
        if (!isEmpty()) {
            for (int i = front; i != rear; i = (i + 1) % MAX_SIZE) {
                if (arr[i] == element) {
                    pos = i;
                    break;
                }
            }
            // to include the last element
            if (pos == -1) {
                if (arr[rear] == element) {
                    pos = rear;
                }
            }

        } else {
            System.out.println("queue is empty");
        }
        return pos;
    }

}
