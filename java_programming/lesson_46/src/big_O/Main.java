package big_O;

public class Main {
    public static void main(String[] args) {
    }

    // O(1)
    public static void method1(int arr[]) {
        arr[1] = 10;
        arr[1] = arr[0] + arr[1];
    }

    // O(n)
    public static void method2(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
            arr[i] = arr[0] + arr[1];
        }
    }

    // O(n^2)
    public static void method3(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i] = 10;
                arr[i] = arr[0] + arr[1];
            }
        }
    }

    // O(n^3)
    public static void method4(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    arr[i] = 10;
                    arr[i] = arr[0] + arr[1];
                }
            }
        }
    }
}
