package nested;

public class Demo4 {
    public static void main(String[] args) {
        HelloWorld englishGreeting = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        };
        englishGreeting.greet();
        HelloWorld frenchGreeting = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Salut tout le monde!");
            }
        };
        frenchGreeting.greet();

        greet(new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Hello World");
            }
        });

        greet(new HelloWorld() {
            int num = 5;
            @Override
            public void greet() {
                System.out.println("Guten Tag!");
                incrementNum();

            }
            private void incrementNum() {
                num++;
            }
        });
    }

    public static void greet(HelloWorld helloWorld) {
        helloWorld.greet();

    }
}
