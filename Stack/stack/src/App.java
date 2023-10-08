public class App {
    public static void main(String[] args) {
        MyStack myCustomStack = new MyStack();

        myCustomStack.push(5);
        myCustomStack.push(10);
        myCustomStack.push(15);
        myCustomStack.push(20);
        myCustomStack.pop();
        myCustomStack.push(25);
        myCustomStack.print();
        int topValue = myCustomStack.getTop();
        System.out.println("Top value= " + topValue);

    }
}
