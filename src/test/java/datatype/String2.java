package datatype;

public class String2 {
    public static void main(String[] args) {
        stringFormat();
        stringEscape();
    }

    public static void stringEscape() {
        // \" \\ \n \t
        System.out.println("Hello \"Lan\"");
    }

    public static void stringFormat() {
        var str1 = "Hello";
        var str2 = "username";
        var formatStr = "%s %s %d %f";
        // %s: string
        // %d: decimal
        // %f: float
        // %n: new line
        // %t: time
        System.out.println(formatStr.formatted(str1, str2, 2, 10.5));
//        System.out.println(String.format(formatStr, str1, str2));
    }
}
