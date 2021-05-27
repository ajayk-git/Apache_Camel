import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import routeBuilders.HelloWorldRouteBuilder;

public class HelloWorld {


    public static void main(String[] args) throws Exception {
        CamelContext camelContext=new DefaultCamelContext();
        camelContext.addRoutes(new HelloWorldRouteBuilder());
        camelContext.start();
    }
}
