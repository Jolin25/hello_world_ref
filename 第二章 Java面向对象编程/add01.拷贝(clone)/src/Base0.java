import java.util.Arrays;

/**
 * @author jrl
 * @date Create in 12:31 2022/11/9
 */
public class Base0 implements Cloneable {
    int a = 0;
    Integer b;
    Son s1 = new Son(new Person("o", 0));
    final Son finalSon1 = new Son();

    public static void main(String[] args) throws CloneNotSupportedException {
        Base0 base0 = new Base0();
        base0.shallowCopy();
        Son ori1 = new Son();
        Son clone2 = ori1.clone();
        System.out.println(clone2.lovers == ori1.lovers);
    }

    private void shallowCopy() throws CloneNotSupportedException {
        Son son = new Son();
        Base0 base0 = new Base0();
        Base0 clone = (Base0) base0.clone();
        System.out.println(clone == base0);//false
        clone.a = 3;
        clone.b = 3;
        clone.s1.lovers = new Person("xxx", 1);
        System.out.println(base0.a == clone.a);
        System.out.println(base0.b == clone.b);
        System.out.println(base0.s1 == clone.s1);
        System.out.println(base0.s1.lovers.name);
        System.out.println(base0.finalSon1 == clone.finalSon1);
        Son[] arr1 = {new Son()};
        Son[] clone1 = arr1.clone();
        System.out.println(Arrays.toString(clone1));
        System.out.println(arr1 == clone1);
        System.out.println(arr1[0] == clone1[0]);


    }
}
