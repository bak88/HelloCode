package Java.lectures.lectures04;

import java.util.*;

public class Ex003_Deque {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
//        deque.removeLast();
//        deque.removeLast();
        deque.offerFirst(12); // Добавляет эл-нт obj в начало очереди, и возвращает true если эл-нт добавлен, в противном случае вернет false
        deque.offerLast(21); // Добавляет эл-нт obj в конец очереди, и возвращает true если эл-нт добавлен, в противном случае вернет false
        deque.pollFirst(); // Возвращает и удаляет первый элемент из очереди, вернет null, если нет элементов
        deque.pollLast(); // Возвращает и удаляет последний элемент из очереди, вернет null, если нет элементов
        deque.getFirst(); // Возвращает первый элемент из очереди
        deque.getLast(); // Возвращает последний элемент из очереди
        deque.peekFirst(); // Возвращает (но не удаляет) первый элемент из очереди
        deque.peekLast(); // Возвращает (но не удаляет) последний элемент из очереди
        System.out.println(deque);
    }
}