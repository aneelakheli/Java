public class LambdaExpressionExample{
    public static void main(String[] args) {
        functionFOrInterface fobj = (int x) -> System.out.print(2 *x);
        fobj.abstractFun(9);
        fobj.normalFun();
    }

}
interface functionFOrInterface{
    void abstractFun(int x);
    default void normalFun(){
        System.out.print(" Hello");
    }
}