package ex_30_Collection_Framework.CF_01_LIST;

import java.util.LinkedList;


public class Lab234 {
    static void main(String[] args) {
        LinkedList<String> list = new LinkedList();
        list.add("apple");
        list.add("orange");
        list.add("pear");
        list.addFirst("Mango");
        list.addLast("Grapes");
        System.out.println(list);

        list.getFirst();
        list.removeFirst();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("apple"));
        System.out.println(list);
    }
}
