package HW09;

public class Main {

    public static void main(String[] args) {
        MyLinkedList lists = new MyLinkedList();
        System.out.println(" - pushToHead - ");
        lists.pushToHead(5);
        lists.pushToHead(3);
        lists.pushToHead(6);
        lists.print();
        System.out.println(" - pushToTail - ");
        lists.pushToTail(7);
        lists.print();
        System.out.println(" - pushToIndex - ");
        lists.pushToIndex(2, 10);
        lists.print();
        System.out.println(" - removeFirst - ");
        lists.removeFirst();
        lists.print();
        System.out.println(" - removeLast - ");
        lists.removeLast();
        lists.print();
        System.out.println(" - remove - ");
        lists.remove(1);
        lists.print();
        System.out.println("get(1) = "+lists.get(1));
        System.out.println("Size="+lists.size());

        // Test loop detection
        MyLinkedList list = new MyLinkedList();
        // Add elements to the list
        list.get(1);
        list.get(2);
        list.get(3);
        list.get(4);
        list.get(5);
        // Create a loop in the list
        list.createLoop();
        // Check for the presence of a loop
        System.out.println("Loop detected: " + list.detectLoop());
    }
}


