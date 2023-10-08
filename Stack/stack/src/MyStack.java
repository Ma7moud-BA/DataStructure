public class MyStack {
    // implementation for the stack using array
    private int MAX_SIZE = 100;
    private int top;
    private int[] item = new int[MAX_SIZE];

    public MyStack() {
        // starting with -1 because before every push method we will increase the top by
        // 1
        top = -1;
    }

    public void push(int element) {
        if (top > MAX_SIZE - 1)// 0-99
        {
            System.out.println("Stack full on push");
        } else {

            top++;
            item[top] = element;
        }
    }

    public boolean isEmpty() {
        return top < 0;// if top ==-1 "initial value" return true
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack empty on pop");
        }
        top--;
    }

    public int popWithSave() {
        // same as pop put will the ability to save the popped value in a variable
        // before popping it
        if (isEmpty()) {
            System.out.println("Stack empty on pop");
            return 0;
        } else {
            top--;
            return item[top];
        }
    }

    public int getTop() {
        if (isEmpty()) {
            System.out.println("Stack empty on getTop");
            return 0;
        } else {

            return item[top];
        }
    }

    public void print() {
        System.out.print("[ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(item[i] + " ");
        }
        System.out.println(" ]");
    }
}
