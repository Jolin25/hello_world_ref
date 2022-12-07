package 集合遍历;

import 集合判空.IsEmpty0;

import java.util.Iterator;
import java.util.List;

/**
 * @author jrl
 * @date Create in 19:12 2022/11/23
 */
public class Iterator0 {
    public static void main(String[] args) {
        List<String> list = IsEmpty0.initList();
        Iterator<String> iterator = list.iterator();
        // 这样删除也是不可以的哈，Iterator 很无辜，
        // 就很气，感觉自己的元素莫名其妙的少了
        // 然后 next()方法就气了。
        while (iterator.hasNext()) {
            String next = iterator.next();
            list.remove(next);
        }
        System.out.println(list);

    }
}
