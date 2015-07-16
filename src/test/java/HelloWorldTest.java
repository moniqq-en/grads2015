import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;


public class HelloWorldTest {

    @Test
    public void testHello () {
        HelloWorld hello = new HelloWorld();
        assertThat(hello.sayIt()).isEqualTo("Hello, world!");

    }
}