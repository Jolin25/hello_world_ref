package 集合遍历;

import 集合判空.IsEmpty0;

import java.util.List;

/**
 * @author jrl
 * @date Create in 19:28 2022/11/23
 */
public class Collection0 {
    public static void main(String[] args) {
        List<String> list = IsEmpty0.initList();
        list.removeIf(filter -> filter.charAt(0) % 2 == 0);
        System.out.println(list);

    }
}
