// package src.ObjectOrientedConcept.Encapsulation;

public class EncapsulationExample2 {
    public static void main(String[] args) {
        EncapsulationExample1 acc = new EncapsulationExample1();
        acc.setAccountNo(1825478900098007l);
        acc.setAmount(78000f);
        acc.setName("Bishnu");
        acc.setEmail("bishnu.blacktech@gmail.com");
        System.out.println(acc.getAccountNo() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());

    }

}
