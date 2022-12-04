// A simple generic class. here, T is a types parameter that will be replaced by a real types when an object 
// of types Gen is Created

class Generics<T>{
    T ob; //declare an object of type T
    Generics(T o){
        ob= o;
    }
    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type of T is "+ ob.getClass().getName());
    }
}

class GenericDemo1{
    public static void main(String[] args) {
        Generics<Integer> iOb;
        iOb = new Generics<Integer>(98);
        int v = iOb.getOb();
        System.out.println("value: "+ v);
        System.out.println();
        Generics<String> strOb = new Generics<String>("Generics Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}