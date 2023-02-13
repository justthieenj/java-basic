package loop;

public class Loop {
    public static void main(String[] args) {
        introduction();
        doWhile();
    }

    public static void introduction() {
        String str = "Selenium";
        // i++ -> i = i + 1
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i + " " + str.charAt(i));
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(i + " " + str.charAt(i));
        }

        // while
        int i = 0;
        while (i < str.length()) {
            System.out.println(i + " " + str.charAt(i));
            i++;
        }
    }

    public static void doWhile() {
        String str = "Naruto";
        int i = 0;
        do {
            System.out.println(i + " " + str.charAt(i));
            i++;
        } while (i < str.length());
    }
}
