//package restClient.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//@RestController
//public class Communication {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @GetMapping
//    public String getUserList() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        return restTemplate.exchange(
//                "http://94.198.50.185:7081/api/users",
//                HttpMethod.GET, entity, String.class).getBody();
//    }
//
//    @PostMapping
//    public String createProducts(@RequestBody User user) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//        HttpEntity<User> entity = new HttpEntity<>(user,headers);
//
//        return restTemplate.exchange(
//                "http://94.198.50.185:7081/api/users", HttpMethod.POST, entity, String.class).getBody();
//    }
//
//    @PutMapping
//    public String updateProduct(@RequestBody User user) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<User> entity = new HttpEntity<>(user,headers);
//
//        return restTemplate.exchange(
//                "http://94.198.50.185:7081/api/users", HttpMethod.PUT, entity, String.class).getBody();
//    }
//
//    @DeleteMapping
//    public String deleteProduct(@PathVariable("id") String id) {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//        HttpEntity<User> entity = new HttpEntity<>(headers);
//
//        return restTemplate.exchange(
//                "http://94.198.50.185:7081/api/users/"+id, HttpMethod.DELETE, entity, String.class).getBody();
//    }
//}