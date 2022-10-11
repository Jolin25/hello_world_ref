import java.io.UnsupportedEncodingException;

public class ComplexChar {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // int a = 65;
        // char cha = (char) a;
        // // \\u 是 Unicode
        // char zang = '\u81e7';
        //
        // System.out.println(cha);
        //
        // System.out.println(zang);

        new ComplexChar().jrl();
    }

    private void jrl() throws UnsupportedEncodingException {
        byte[] bytes = "中".getBytes("utf-16");
        for (byte aByte : bytes) {
            System.out.println(Integer.toHexString(Byte.toUnsignedInt(aByte)));
        }
        byte[] bytes8 = "中".getBytes("utf-8");
        for (byte aByte : bytes8) {
            System.out.println(Integer.toHexString(Byte.toUnsignedInt(aByte)));
        }
        String s = "ﾖ"; //0xFF6E
        System.out.println(s.getBytes().length);//length of the string
        System.out.println(s.charAt(0));//first character in the string
    }
}
