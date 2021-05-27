import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import routeBuilders.FileCopyRouteBuilder;

public class FileCopy {
    public static void main(String[] args) throws Exception {
        CamelContext camelContext=new DefaultCamelContext();

        camelContext.addRoutes(new FileCopyRouteBuilder());

        while (true){
            camelContext.start();
        }
    }
}
