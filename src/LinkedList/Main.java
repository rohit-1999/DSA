package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original list:");
        list.printLL();
        list.deleteFirst();
        System.out.println("After deleting first node:");
        list.printLL();
        list.deletLast();
        System.out.println("After deleting last node:");
        list.printLL();
        System.out.println("Size of linkelist is: "+ list.size());
        list.size();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printLL();
        list.reverseLL();
        System.out.println("After reversing the ll0:");
        list.printLL();
    }
}
