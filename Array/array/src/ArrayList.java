public class ArrayList {
    private int MAX_SIZE;
    private int arr[];
    private int length;

    public ArrayList(int size) {
        if (size < 0) {
            MAX_SIZE = 10;

        } else {
            MAX_SIZE = size;
        }
        this.arr = new int[MAX_SIZE];
        length = 0;

    }

    public boolean isEmpty() {
        return length == 0;

    }

    public boolean isFull() {
        return length == MAX_SIZE;

    }

    public int getSize() {
        return length;

    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void insertAtPos(int pos, int element) {
        if (isFull()) {
            System.out.println("list full");
        } else if (pos < 0 || pos > length) {
            System.out.println("out of range");
        } else {
            for (int i = length; i > pos; i--) {
                arr[i] = arr[i - 1];

            }
            arr[pos] = element;
            length++;
        }
    }

    public void removeAtPos(int pos) {
        if (isEmpty()) {
            System.out.println("list empty");

        } else if (pos < 0 || pos > length) {
            System.out.println("out of range");
        } else {
            for (int i = pos; i < length; i++) {
                arr[i] = arr[i + 1];
            }
            length--;
        }

    }

    public void insertAtEnd(int element) {
        if (isFull()) {
            System.out.println("list full");
        } else {
            arr[length] = element;
            length++;
        }
    }

    public void updateAt(int pos, int element) {
        if (pos < 0 || pos >= length) {
            System.out.println("out of range");
        } else {
            arr[pos] = element;
        }
    }

    public int getElement(int pos) {
        if (pos < 0 || pos >= length) {
            System.out.println("out of range");
            return -1;
        } else {
            return arr[pos];
        }
    }

}
