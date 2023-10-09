public class App {
    public static void main(String[] args) {
        ArrayList myArray = new ArrayList(10);
        myArray.insertAtPos(0, 10);
        myArray.insertAtPos(1, 20);
        myArray.insertAtPos(2, 30);
        myArray.insertAtEnd(40);
        myArray.updateAt(1, 25);
        myArray.print();
    }
}
