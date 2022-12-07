import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jrl
 * @date Create in 14:50 2022/11/23
 */
public class Collections0 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Collections.reverse(list);
        System.out.println(list);
    }
}
