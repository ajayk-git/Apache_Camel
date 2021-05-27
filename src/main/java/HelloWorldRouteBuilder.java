import org.apache.camel.builder.RouteBuilder;

public class HelloWorldRouteBuilder extends RouteBuilder {
    public void configure() throws Exception {
        System.out.println("Hello world using Apache Camel.");
    }
}
