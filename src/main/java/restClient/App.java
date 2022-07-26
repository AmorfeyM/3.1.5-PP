package restClient;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import restClient.configuration.Config;
import restClient.model.CommunicatorNEW;
import restClient.model.User;

import java.util.List;


public class App {

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        CommunicatorNEW communicatorNEW = context.getBean(CommunicatorNEW.class);

        System.out.println(communicatorNEW.getInfo());

    }

}
