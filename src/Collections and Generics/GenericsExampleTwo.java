class Example< Gen1, Gen2>{
    Gen1 obj1;
    Gen2 obj2;
    // Creating constructor
    Example(Gen1 obj1, Gen2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void printGenerics(){
        System.out.println("Generics First is printing: \n"+ obj1);
        System.out.println(" ");
        System.out.println("Generics Second is printing: \n"+ obj2);
    }
}

public class GenericsExampleTwo {
    public static void main(String[] args) {
        Example <Integer,String> createObject = new Example<Integer, String>(89,"generics");
        createObject.printGenerics();
        }
    
}
