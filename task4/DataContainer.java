package seminar_4.task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// создаём обобщенный класс имплементирующий интерфейс с 4 методами
public class DataContainer<T extends Comparable<T>> implements IContainer<T> {
    List<T> container;

    // базовый конструктор для создания пустого массива для хранения данных
    public DataContainer() {
        container = new ArrayList<T>();
    }

    @Override
    public void add(T item) {
        container.add(item);
    }

    @Override
    public T get(int index) {
        return container.get(index);
    }

    @Override
    public void sort(Comparator<T> c) {
        container.sort(c);
    }

    @Override
    public void print() {
        for (T item : container) {
            System.out.println(item);
        }
    }
}
