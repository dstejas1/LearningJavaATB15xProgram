package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("Tejas");
        list.add("suhas");
        list.add("Nithin");

        System.out.println(" - To Print Arraylist - 1 ");

        for(String name:list){
            System.out.println(name);
        }
        System.out.println(" - To Print Arraylist - 2 ");

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(" - To Print Arraylist - 3 ");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
