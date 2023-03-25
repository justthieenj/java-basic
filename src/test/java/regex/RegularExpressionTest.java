package regex;

import java.util.List;

public class RegularExpressionTest {
    private static final String SELENIUM = """
            WebDriver drives a browser natively, as a user would, either locally or on a remote machine using the Selenium server, marks a leap forward in terms of browser automation.
            Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. This is commonly referred to as just WebDriver.
            """;

    private static final String TEXT = """
            The cat fat ran down the street.
            It was searching for a mouse to eat.
            """;
    private static final List<String> biensoxe = List.of("43A-12345", "43A-123456", "59A-1234567", "59A-12345678", "29D-123456789", "43D-1234567890");
    // yyyy/MM/dd
    private static final List<String> dob = List.of("1990/02/09", "2000/99/09");

    public static void main(String[] args) {
        // search or validate a string
        "abc2".matches("\\wbc\\d"); // true
        "yzx".replace("yz", "ab"); // abx
        "yzx".replaceAll("yz", "ab"); // abx
    }
}
