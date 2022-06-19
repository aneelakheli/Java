public class LogicalOperator {
    public static void main(String[] args) {
        int a = 2300;
        int b = 900;
        int c = 9087;
        System.out.println(a < b && a > c); // false.
        System.out.println(b < a || c > a); // logical operator
        System.out.println(a > b && a < c); // logical operator
        System.out.println(a > b | a++ < b);
        System.out.println(a);
        System.out.println(a < b & a++ < b);
        System.out.println(a);

    }
}