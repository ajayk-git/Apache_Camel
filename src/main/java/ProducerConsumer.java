import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class ProducerConsumer {


    public static void main(String[] args) throws Exception {
        CamelContext camelContext = new DefaultCamelContext();
        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                from("direct:StartingPoint").to("seda:EndingPoint");
            }
        });

        camelContext.start();

        ProducerTemplate producerTemplate = camelContext.createProducerTemplate();           //Creating Producer camel
        ConsumerTemplate consumerTemplate = camelContext.createConsumerTemplate();          //Creating Producer camel

        //"StartingPoint" and "EndingPoint" are the end points of Producer and consumer respectively
        producerTemplate.sendBody("direct:StartingPoint", "Message from Producer's endPoint.");
        String messagefromCamelContext = consumerTemplate.receiveBody("seda:EndingPoint", String.class);

        System.out.println(messagefromCamelContext);
    }


}
