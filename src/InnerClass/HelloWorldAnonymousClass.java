public class HelloWorldAnonymousClass{
    interface HelloWorld{
        public void greet();
        public void greetSomeone(String someone);
    }
    public void sayHello(){
        class EnglishGreeting implements HelloWorld{
            String name = "Beautiful";
            public void greet(){
                greetSomeone("java");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println("Pokhara "+ name);
            }
        }
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new HelloWorld(){
            String name = " tout de monde";
            public void greet(){
                System.out.println("tout de monde");
            }
            public void greetSomeone(String someone){
                name = someone;
                System.out.println(" salut " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("ramu kaka");
    }
    public static void main(String[] args) {
        HelloWorldAnonymousClass myapp = new HelloWorldAnonymousClass();
        myapp.sayHello();
    }

}