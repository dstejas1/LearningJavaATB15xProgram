package ex_30_Collection_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LabInterview {
    static void main(String[] args) {

        ArrayList  list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        for (Object o:list){
            System.out.println(o);
        }


    }
}
