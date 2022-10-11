public class StringVariable {
    public static void main(String[] args) {
        int a = 10;
        String str = "a的值是";
        str = str + a;
        System.out.println(str);

        String s2 = "a的值是";
        System.out.println(str + a);
        System.out.println(s2);


        String s11 = "java";
        String s22 = "java";
        System.out.println("s11==s22?" + (s11==s22));//true
    }
}
