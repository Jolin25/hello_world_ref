package com.geekbang.learngenerics.onjava8;// generics/ErasedTypeEquivalence.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import com.geekbang.learngenerics.onjava8.onjava.Father;
import com.geekbang.learngenerics.onjava8.onjava.GenericOne;
import com.geekbang.learngenerics.onjava8.onjava.Son;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ErasedTypeEquivalence {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);// 都类型擦除为了 ArrayList
        System.out.println(c1);

        List<Integer> l1 = new ArrayList<>(); // 这里类型参数设置为了 Integer
        Class<? extends List> clazz = l1.getClass();
        Method add = clazz.getDeclaredMethod("add", Object.class);
        // 这里通过反射来调用add方法时，放入了 String 类型的元素，说明了 泛型的限制是在编译阶段，
        // 在运行期间是不管的
        add.invoke(l1, "abc");


        new ErasedTypeEquivalence().f();


        // 通配符
        List  list1 = new ArrayList<>(); // Object
        list1.add("1");
        Object o = list1.get(0);

        System.out.println("-------------------");
        GenericOne<Son> genericOne = new GenericOne<>();
        genericOne.method1(new ArrayList<>());

    }

    private void f() throws NoSuchFieldException {
        Aa aa = new Aa<Son>();
        Aa aa2 = new Aa<Father>();


        aa.ff(new Son());
        aa.ff(new Father());

        System.out.println(aa.getClass().equals(aa2.getClass()));
    }

    class Aa<T extends Father> {

       <E extends Father> void ff(E f1) {
            System.out.println(f1.getClass().getName());
        }
        // 编译报错：
        // Type parameter 'T' cannot be instantiated directly
        // 因为对于 Java 数组而言，它必须知道自己持有的所有对象的具体类型
        // TODO_Joly:为什么，数组不可以里面只是放着引用吗
        // T[] field2 = new T[10];
    }
}

/* Output:
true
class java.util.ArrayList
*/
