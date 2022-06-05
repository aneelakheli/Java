package ObjectOrientedConcept.Inheritance;

public class HasAInheritance {
    int id;
    String name;
    Address address;

    public HasAInheritance(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address ad = new Address("Pokhara", "province-4", "Nepal");
        Address ad1 = new Address("kathmandu", "province-3", "Nepal");
        HasAInheritance info = new HasAInheritance(12, "Prakash", ad1);
        info.display();

    }
}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}