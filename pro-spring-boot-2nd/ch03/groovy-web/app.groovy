import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration

@RestController
@EnableAutoConfiguration(exclude=[ActiveMQAutoConfiguration.class])
class WebApp{

    @GetMapping('/')
    String index(){
       "Spring Boot Rocks"
    }
}

