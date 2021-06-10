package nl.oraculo.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println((new HelloWorld().sayHelloWorld()));
    }

    public String sayHelloWorld() {
        return "Hello World!";
    }

}
