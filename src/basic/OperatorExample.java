public class OperatorExample {
    public static void main(String[] args) {
        int a = 90;
        int o = 89;
        int m = -78;
        int p = 898;
        boolean f = true;
        System.out.println(~a); // (minus of Total positive value whicch start from 0)
        System.out.println(~o);
        System.out.println(~m); // (postive of total minus value, positive start from 0)
        System.out.println(a++); // post increment ++( unary operator)
        System.out.println(++a); // pre increment ++
        System.out.println(--a); // pre decrement --
        System.out.println(a--); // post decrement --
        System.out.println(!f); // result :true,
        System.out.println(a + o); // addtion operator +
        System.out.println(m - a); // substraction operator -
        System.out.println("The modulo operation is: " + p % o); // modul0 operator
        System.out.println(10 << 2); // shift operator. here, left shift operator 10 * 2^2
        System.out.println(10 << 9); // left shift operator. here, 10 * 2^9
        System.out.println(10 << 2); // left shift operator. here, 10 * 2^2
        System.out.println(230 >> 2); // right shift operator. here, 230/2^2
    }
}