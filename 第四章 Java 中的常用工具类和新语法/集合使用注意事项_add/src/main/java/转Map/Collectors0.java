package 转Map;

import 集合判空.IsEmpty0;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jrl
 * @date Create in 18:02 2022/11/24
 */
public class Collectors0 {
    public static void main(String[] args) {
        new Collectors0().toMap();

    }

    private void toMap() {
        List<String> list = IsEmpty0.initList();
        list.stream().collect(Collectors.toMap(List::get, List::get));
    }
}
