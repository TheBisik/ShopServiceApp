package utils;

import domain.Product;

import java.math.BigDecimal;

public class DisplayUtil {

    public static void space() {
        System.out.println(" ");
    }

    public static void displayInLine(String value) {
        System.out.println(value);
    }
        //todo do naprawy / zastosować gettery do metody
/*    public static void displayInLine(Product product) {
        var information = "ID: " + product.getId + "\nCloths type for washing: " + enumValue.name() + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln"
        System.out.println(information);
    }*/

    /*public static <E extends Enum<E>> void describeThis(long id, Enum enumValue, String name, String description, BigDecimal price) {
       if (enumValue instanceof enums.ClothsTypeForWashing) {
           DisplayUtil.displayInLine("ID: " + id + "\nCloths type for washing: " + enumValue.name() + "\nName: " + name + "\nDescription: " + description + "\nPrice: " + price + "pln");
       } else if (enumValue instanceof enums.SoapType) {
           displayInLine("ID:\t" + id + "\nName:\t" + name + "\nType of Soap:\t" + enumValue.name() + "\nDescription:\t" + description + "\nPrice:\t" + price + "pln");
       } else if (enumValue instanceof enums.CountOfBlades) {
           displayInLine("ID:\t" + id + "\nName:\t" + name + "\nCount of Blades:\t" + enumValue.name() + "\nDescription:\t" + description + "\nPrice:\t" + price + "pln");
       } else{
           displayInLine("Typ nie obsługiwany!");
       }
    }*/
}

