package ru.gb.sem09;

import java.util.*;

/**
 * Разработать программу, имитирующую поведение коллекции HashSet.
 * В программе содать метод add добавляющий элемент, метод toString возвращающий строку
 * с элементами множества и метод позволяющий читать элементы по индексу.
 * *Реализовать все методы из семинара.
 * Формат данных Integer.
 */

public class Main {
    public static void main(String[] args) {

        MySet m = new MySet();
        System.out.println(m.add(1));
        System.out.println(m.add(11));
        System.out.println(m.add(111));
        System.out.println(m.add(1111));
        System.out.println(m.add(11111));
        System.out.println(m.add(111111));
        System.out.println(m.remove(111));
        System.out.println(m.isEmpty());

        Iterator<Integer> iterator = m.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }
    }
}
class MySet{
    private HashMap<Integer, Object> list = new HashMap<>();
    private static final Object X = new Object();

    //метод, чтобы добавить элемент
    public boolean add(int elem){
        return list.put(elem, X) == null;
    }

    //метод, чтобы удалить элемент
    public boolean remove(int elem){
        return list.remove(elem) == X;
    }

    //метод, чтобы проверить пустой ли множество
    public boolean isEmpty(){
        return list.isEmpty();
    }

    //метод, чтобы проверить наличие элемента
    public boolean contains (int elem){
        return list.containsKey(elem);
    }
    //метод, чтобы вернуть значение по индексу
    public int get (int index) {
        Object[] a=list.keySet().toArray();
        return (int) a[index];
    }

    //метод, чтобы вернуть итератор
    public Iterator<Integer> iterator(){
        return list.keySet().iterator();
    }
}