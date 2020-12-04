package exam;

public class AnonymousLocalClasses {
	  
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    
    HelloWorld greetingVar = new HelloWorld() {
    	public void greet() {
    		this.greetSomeone("bud");
    	}
    	public void greetSomeone(String aName) {
    		System.out.println("Yo " + aName);
    	}
    };
  
    public void sayHello() {
        
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
        
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        greetingVar.greet();
        AnonymousLocalClasses.this.greetingVar.greetSomeone("fine gentleperson");
    }

    public static void main(String... args) {
        AnonymousLocalClasses myApp =
            new AnonymousLocalClasses();
        myApp.sayHello();
    }            
}