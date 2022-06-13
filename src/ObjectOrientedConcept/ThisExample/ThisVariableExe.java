/* 
Author Anil Akheli
a java program for implementation of this keyword in variable
 */
package src.ObjectOrientedConcept.ThisExample;

public class ThisVariableExe {
    String itemName;
    int price;
    private static String setItemsName;

    public ThisVariableExe(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public String setItemsName() {
        return itemName + " " + price;
    }

    public static void main(String[] args) {
        ThisVariableExe tv = new ThisVariableExe("Potatoes", 40);
        setItemsName = tv.setItemsName();
        System.out.println(setItemsName);
    }

}
