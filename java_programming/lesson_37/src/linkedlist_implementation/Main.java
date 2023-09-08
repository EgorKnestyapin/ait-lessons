package linkedlist_implementation;

public class Main {
    public static void main(String[] args) {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.append(new String("ABC"));
        list.append(new String("Jack"));
        list.append(new String("John"));
        list.set(0, "CBA");
        System.out.println(list.get(0));
        System.out.println(list.remove("John"));
        list.printList();
    }
}
