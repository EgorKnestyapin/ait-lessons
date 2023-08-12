package lesson;

public class Group {
    private int size = 0;
    private Student[] arr = new Student[4];

    public void add(Student element) {
        if (size >= arr.length) {
            increaseArray();
        }
        arr[size] = element;
        size++;
    }

    public void increaseArray() {
        Student[] tempArray = new Student[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }
}
