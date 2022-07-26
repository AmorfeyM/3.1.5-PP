package restClient;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


import restClient.model.User;

import java.util.List;

@SpringBootApplication
public class App {


    private static RestTemplate restTemplate = new RestTemplate();
    private static final String URL = "http://94.198.50.185:7081/api/users";

    public static void main( String[] args ) {

        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<>() {});
        HttpHeaders headers = responseEntity.getHeaders();
        System.out.println(headers.getFirst(HttpHeaders.SET_COOKIE));

        String sessionId = headers.getFirst(HttpHeaders.SET_COOKIE);


        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add("Cookie", sessionId);
        requestHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
        System.out.println(requestHeaders);

        User newUser = new User(3L, "James", "Brown", (byte)12);


        HttpEntity<User> requestEntity = new HttpEntity<>(newUser, requestHeaders);
        System.out.println(requestEntity);

        ResponseEntity<String> response = restTemplate.exchange(URL, HttpMethod.POST, requestEntity, String.class);
        System.out.println(response.getBody());
    }


}
