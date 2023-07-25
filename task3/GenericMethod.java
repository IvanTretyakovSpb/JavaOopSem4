package seminar_4.task3;

public class GenericMethod {

    public static <T extends Comparable<T>> T getMax(T o1, T o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        return o2;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        System.out.println("Max value from " + a + " and " + b + " is: " + getMax(a, b));
        System.out.println();

        byte c = -3;
        byte d = 77;
        System.out.println("Max value from " + c + " and " + d + " is: " + getMax(c, d));
        System.out.println();

        double w = 55.33;
        double v = 0.29;
        System.out.println("Max value from " + w + " and " + v + " is: " + getMax(w, v));
        System.out.println();

        String s = "Hello!";
        String t = "Welcome!";
        System.out.println("Max value from " + s + " and " + t + " is: " + getMax(s, t));

        char x = 'W';
        char y = 'A';
        System.out.println("Max value from " + x + " and " + y + " is: " + getMax(x, y));
    }
}
