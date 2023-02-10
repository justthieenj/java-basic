public class StringTest {
    public static void main(String[] args) {
    }

    public static void example1() {
        String str = "Hello";
        String str2 = "Thien";
        int age = 1;
        boolean isTrue = true;
        var result = str + str2 + age + isTrue;
        System.out.println(result);
    }

    public static void example2() {
        String str = "Hello World!";
        System.out.println(str.charAt(0)); // first character
        System.out.println(str.charAt(12)); // error
        System.out.println(str.indexOf("W"));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("l"));
        System.out.println(str.length());
    }

    public static void example3() {
        String str = "Hello World!";
        var r = str.substring(6, 11);
        System.out.println(r); // World
    }
}
