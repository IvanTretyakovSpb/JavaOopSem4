package seminar_4;


public class Task1 {

    //    создаём статический параметризованный (обобщённый) метод внутри необобщенного класса
    static <T> void printElement(T item) {
        System.out.println("The value of item is: " + item); // выводим в консоль значение
        System.out.println("The type of item is: " + item.getClass().getSimpleName()); // выводим в консоль тип данных
        System.out.println();
    }

    public static void main(String[] args) {
        int a = 11;
        printElement(a);

        double b = 99.99;
        printElement(b);

        String str = "Hello world!";
        printElement(str);

        char ch = 'Q';
        printElement(ch);
    }
}
