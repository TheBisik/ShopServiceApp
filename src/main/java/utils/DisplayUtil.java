package utils;

import java.math.BigDecimal;

public class DisplayUtil {

    public static void space() {
        System.out.println(" ");
    }

    public static void displayInLine(String value) {
        System.out.println(value);
    }

    public static <E extends Enum<E>> void describe(long id, E enumValue, String name, String description, BigDecimal price) {
       if (enumValue instanceof enums.CountOfBlades) {

       }


        DisplayUtil.displayInLine("ID: " + id + "\nCloths type for washing: " + enumValue.name() + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln");
    }
}

