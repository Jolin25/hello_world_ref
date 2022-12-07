package 集合遍历;

import 集合判空.IsEmpty0;

import java.util.List;

/**
 * @author jrl
 * @date Create in 16:36 2022/11/23
 */
public class Foreach0<main> {
    public static void main(String[] args) {
        List<String> list = IsEmpty0.initList();
        // 这种方式来删除元素会报错，foreach 语法的底层用的还是 Iterator 的方式。
        //这就导致 Iterator 莫名其妙地发现自己有元素被 remove/add ，然后，它就会抛出一个 ConcurrentModificationException 来提示用户发生了并发修改异常。这就是单线程状态下产生的 fail-fast 机制。
        // java.util.ConcurrentModificationException 异常
        for (String item : list) {
            list.remove(item);
        }
        System.out.println(list);
    }
}
