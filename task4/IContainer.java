package seminar_4.task4;

import java.util.Comparator;


// создаём интерфейс для последующей реализации необходимых методов для работы с данными в хранилище
public interface IContainer<T extends Comparable<T>> {
    void add(T item);

    T get(int index);

    void sort(Comparator<T> c);

    void print();
}
