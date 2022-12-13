public class MainClass {
    public static void main(String[] args) {
        Manager anil = new Manager("Anil");
        Directors arjn = new Directors("aarjan Akheli");
        Supervisor aabu = new Supervisor("aabiskar Akheli");

        Office oracle = new Office("Oracle");
        oracle.addMember(anil);
        oracle.addMember(arjn);
        oracle.addMember(aabu);
        System.out.println(oracle.numEmployee());
    }
}
