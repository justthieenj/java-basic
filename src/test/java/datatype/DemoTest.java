package datatype;

public class DemoTest {

    public static void main(String[] args) {
        var r = compareTwoStrings("Hello", "World");
        System.out.println(r);
    }

    // return type String, parameter/argument ()
    public static boolean compareTwoStrings(String str1, String str2){
        return str1.equals(str2);
    }
}
