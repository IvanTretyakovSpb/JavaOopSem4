package seminar_4;

public class Task2 {
    static <T> void printArray(T[] array) {
        System.out.printf("Type of array: %s, elements:\n", array[0].getClass().getSimpleName());
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] iNumbers = {1, 2, 3, 4, 5};
        Double[] dNumbers = {1.1, 2.2, 3.3, 4.4, 5.5};
        Float[] fNumbers = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        String[] strings = {"one", "two", "three", "four", "five"};

        printArray(iNumbers);
        System.out.println("___".repeat(20));

        printArray(dNumbers);
        System.out.println("___".repeat(20));

        printArray(fNumbers);
        System.out.println("___".repeat(20));

        printArray(strings);
        System.out.println("___".repeat(20));
    }
}
