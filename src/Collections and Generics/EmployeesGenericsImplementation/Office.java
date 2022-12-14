import java.util.ArrayList;

public class Office < T extends Employee> implements Comparable{
    private String name;
    int salary=10000;
    int months = 1;
    
    private ArrayList<T> members= new  ArrayList<>();
    public Office(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public boolean addMember(T employee){
        if(members.contains(employee)){
            System.out.println(employee.getName() +" is already employee of the organization.");
            return false;
        }else{
            members.add(employee);
            System.out.println(employee.getName() + " selected for the organization  " + this.name);
            return true;
        }
    }

    public int numEmployee(){
        return this.members.size();
    }

    public void employeeInformation(Office<T> emp, int salary, int months){
        if(members.contains(emp)){
            System.out.println(emp.getName() + " get a salary of " + salary + " of months " + months);
        }else{
            System.out.println("You selected invalid user name.");
        }

    }

    
}
