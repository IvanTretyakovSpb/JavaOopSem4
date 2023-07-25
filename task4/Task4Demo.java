package seminar_4.task4;

public class Task4Demo {
    public static void main(String[] args) {
        // создаём экземпляр DataContainer для хранения целых чисел
        DataContainer<Integer> dt = new DataContainer<>();

        // заполняем его значениями
        dt.add(77);
        dt.add(100);
        dt.add(95);
        dt.add(-5);
        dt.add(0);

        System.out.println("Неотсортированные элементы, находящиеся в хранилище:");
        dt.print();
        System.out.println("___".repeat(20));
        System.out.println("Элемент с индексом 2: " + dt.get(2));
        System.out.println("___".repeat(20));
        dt.sort((o1, o2) -> o1.compareTo(o2)); // с помощью лямбда-выражения сортируем по возрастанию элементы
        System.out.println("Отсортированные элементы хранилища:");
        dt.print();
        System.out.println("___".repeat(20));
        System.out.println("Элемент с индексом 2: " + dt.get(2));
        System.out.println("===".repeat(20)+"\n");

        // создаём экземпляр DataContainer для хранения строк
        DataContainer<String> dtString = new DataContainer<>();

        // заполняем его значениями
        dtString.add("Mark");
        dtString.add("Ivan");
        dtString.add("Alex");
        dtString.add("Tom");
        dtString.add("Victor");

        System.out.println("Неотсортированные элементы, находящиеся в хранилище:");
        dtString.print();
        System.out.println("___".repeat(20));
        System.out.println("Элемент с индексом 2: " + dtString.get(2));
        System.out.println("___".repeat(20));
        dtString.sort((o1, o2) -> o2.compareTo(o1)); // с помощью лямбда-выражения сортируем по убыванию элементы
        System.out.println("Отсортированные элементы хранилища:");
        dtString.print();
        System.out.println("___".repeat(20));
        System.out.println("Элемент с индексом 2: " + dtString.get(2));
        System.out.println("___".repeat(20));
    }
}
