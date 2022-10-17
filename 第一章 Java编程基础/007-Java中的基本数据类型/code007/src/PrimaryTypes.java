import java.math.BigInteger;

public class PrimaryTypes {
    int a;

    public static void main(String[] args) {
        byte byteVar = 100;
        System.out.println(byteVar);

        short shortVar = 30000;
        System.out.println(shortVar);

        int intVar = 1000000000;
        System.out.println(intVar);

        long longVar = 80000000000L;
        System.out.println(longVar);

        float floatVar = 100.0000000666F;
        System.out.println(floatVar);

        double doubleVar = 100.0000000666;
        System.out.println(doubleVar);

        boolean booleanVar = true;
        System.out.println(booleanVar);

        char charVar = 'a';
        System.out.println(charVar);


        // 引用类型
        BigInteger bigInteger1 = new BigInteger(String.valueOf(2147483647));
        BigInteger bigInteger2 = new BigInteger(String.valueOf(2147483647));
        BigInteger add = bigInteger1.add(bigInteger2);//4294967294
        System.out.println(add);



        // Java 初始值
        int tmp = 0; // 局部变量必需赋初始值，否则编译不通过
        System.out.println(tmp);
        // a 只是实例变量，但还是被初始化为0了。而不仅仅是类变量会被初始化为0
        System.out.println(new PrimaryTypes().a);


        // System
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
        // 用于展示运行此程序的操作系统的所有属性
        System.getProperties().list(System.out);
    }

    private int m1(int a,int b){
        return 0;
    }

    private boolean m1(int a,int b,int c){
       return true;
    }
}
