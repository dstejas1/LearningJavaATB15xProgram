package ex_30_Collection_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.*;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hrr = new HashSet ();
        Set<String> hs = new HashSet();
        hs.add("apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(null);
        hs.add(null);
        System.out.println(hrr);
        System.out.println(" ---------------------------");
    }

}
