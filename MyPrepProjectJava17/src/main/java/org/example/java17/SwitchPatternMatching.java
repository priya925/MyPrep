package org.example.java17;

public class SwitchPatternMatching {

    public static void main(String[] args){
        String longText = """

            This is a text block in Java 17.
            It allows you to write multi-line strings
            without needing to escape newline characters.
            
            You can also preserve leading whitespace for formatting.
                Indented text is also preserved.
                """;
        System.out.println(longText);
        int day = 5;
        String dayOfWeek = switch (day) {

            case 1 -> "Monday";

            case 2 -> "Tuesday";

            case 3 -> "Wednesday";

            case 4 -> "Thursday";

            case 5 -> "Friday";

            default -> "Unknown";

        };
        System.out.println(dayOfWeek);
        System.out.println(3*0.01 == 0.03?true:false);
    }
}
