package test;

/**
 * Created by liumeng09 on 2017/6/26.
 */
public class InternTest {
    public static void main(String[] args) {
        String str1 = "str01";
        String str2 = new String("str")+new String("01");
        str2 = str2.intern();

        System.out.println(str2==str1);//#7
    }
}
