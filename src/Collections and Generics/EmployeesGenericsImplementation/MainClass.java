public class MainClass {
    public static void main(String[] args) {
        Manager anil = new Manager("Anil");
        Directors arjn = new Directors("aarjan Akheli");
        Supervisor aabu = new Supervisor("aabiskar Akheli");
        // Office oracle = new Office("Oracle");

        Office<Manager> manager = new Office<>("Managers");
        manager.addMember(anil);

        Office<Directors> directors = new Office<>("Directors");
        directors.addMember(arjn);
        directors.employeeInformation(directors, 2000000,2);

        manager.employeeInformation(manager, 2000000, 6);

        // oracle.addMember(anil);
        // oracle.addMember(arjn);
        // oracle.addMember(aabu);
        // System.out.println(oracle.numEmployee());
    }
}
