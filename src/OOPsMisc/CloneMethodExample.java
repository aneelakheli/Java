public class CloneMethodExample {
    int arNo;
    String name;
    CloneMethodExample(int arNo,String name){
        this.arNo=arNo;
        this.name = name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        try {
            CloneMethodExample cm = new CloneMethodExample(560, "Returning");
            CloneMethodExample cm2 = (CloneMethodExample)cm.clone();
            System.out.println(cm.arNo+ " " +cm.name);
            System.out.println(cm2.arNo+ " " +cm2.name);
        } catch (CloneNotSupportedException c) {
            //TODO: handle exception
        }
    
}
}