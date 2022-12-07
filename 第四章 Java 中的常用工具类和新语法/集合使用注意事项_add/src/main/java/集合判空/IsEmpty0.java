package 集合判空;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jrl
 * @date Create in 15:00 2022/11/23
 */
public class IsEmpty0 {
    public static void main(String[] args) {
        List<String> list = initList();
        int size = list.size();
        boolean empty = list.isEmpty();
        System.out.println(empty);
    }

    public static List<String> initList() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        return list;
    }
}
