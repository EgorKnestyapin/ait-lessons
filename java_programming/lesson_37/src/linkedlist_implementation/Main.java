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

        System.out.println("-------------------");
        OurLinkedList<Integer> myIntList = new OurLinkedList<>();
        myIntList.append(1);
        myIntList.append(2);
        myIntList.append(3);
        myIntList.append(4);
        myIntList.append(5);

        for (Integer i : myIntList) {
            System.out.println(i);
        }
    }
}
