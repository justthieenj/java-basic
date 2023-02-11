package ifelseswitchcase;

public class SwitchCase {
    public static void main(String[] args) {
        // print out the day of the week if the number is 1-7
        // Example: 1 -> Sunday, 2 -> Monday, 3 -> Tuesday, 4 -> Wednesday, 5 -> Thursday, 6 -> Friday, 7 -> Saturday
        var result = getDayUsingIfElse(3);
        var r2 = getDayUsingSwitchCase(1);
        System.out.println(r2);
    }

    public static String getDayUsingSwitchCase(int number) {
        return switch (number) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Number is not valid";
        };
    }

    public static String getDayUsingIfElse(int number) {
        if (number == 1) {
            return "Sunday";
        } else if (number == 2) {
            return "Monday";
        } else if (number == 3) {
            return "Tuesday";
        } else if (number == 4) {
            return "Wednesday";
        } else if (number == 5) {
            return "Thursday";
        } else if (number == 6) {
            return "Friday";
        } else if (number == 7) {
            return "Saturday";
        }
        return "Number is not valid";
    }
}
