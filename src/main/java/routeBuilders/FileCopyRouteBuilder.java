package routeBuilders;

import org.apache.camel.builder.RouteBuilder;

public class FileCopyRouteBuilder extends RouteBuilder{
    public void configure() throws Exception {
        from("file:inputbox?noop=true").to("file:outputbox");
    }
}
