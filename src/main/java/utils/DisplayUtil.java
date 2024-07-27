package utils;

import java.math.BigDecimal;

public class DisplayUtil {

    public static void space() {
        System.out.println(" ");
    }

    public static void displayInLine(String value) {
        System.out.println(value);
    }

    public static <E extends Enum<E>> void describeThis(long id, Enum enumValue, String name, String description, BigDecimal price) {
       if (enumValue instanceof enums.ClothsTypeForWashing) {
           DisplayUtil.displayInLine("ID: " + id + "\nCloths type for washing: " + enumValue.name() + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln");
       } else if (enumValue instanceof enums.SoapType) {
           displayInLine("ID:\t" + id + "\nName:\t" + name + "\nType of Soap:\t" + enumValue.name() + "\nDescription:\t" + description + "\nPrice:\t" + price + "pln");
       } else if (enumValue instanceof enums.CountOfBlades) {
           displayInLine("ID:\t" + id + "\nName:\t" + name + "\nCount of Blades:\t" + enumValue.name() + "\nDescription:\t" + description + "\nPrice:\t" + price + "pln");
       }
    }
}

