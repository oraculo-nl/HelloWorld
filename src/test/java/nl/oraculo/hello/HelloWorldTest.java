package nl.oraculo.hello;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @org.junit.jupiter.api.Test
    void sayHelloWorld() {
        var hw = new HelloWorld();
        Assertions.assertEquals("Hello World!", hw.sayHelloWorld());
        Assertions.assertNotEquals("", hw.sayHelloWorld());
    }
}