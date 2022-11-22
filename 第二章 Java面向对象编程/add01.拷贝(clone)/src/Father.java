/**
 * @author jrl
 * @date Create in 12:29 2022/11/9
 */
public class Father implements Cloneable {
    int age;
    String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
