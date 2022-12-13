import java.util.ArrayList;

public class Office {
    private String name;
    int salary=10000;
    
    private ArrayList<Employee> members= new  ArrayList<>();
    public Office(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public boolean addMember(Employee employee){
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

    
}
