//package restClient.model;
//
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.*;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class CommunicatorNEW {
//
//    private RestTemplate restTemplate;
//    private final String URL = "http://94.198.50.185:7081/api/users";
//
//    public CommunicatorNEW(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//
//    public String getInfo() {
//        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
//                new ParameterizedTypeReference<>() {});
//        HttpHeaders headers = responseEntity.getHeaders();
//        System.out.println(headers.getFirst(HttpHeaders.SET_COOKIE));
//
//        String sessionId = headers.getFirst(HttpHeaders.SET_COOKIE);
//
//
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Cookie", sessionId);
//        requestHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));
//        System.out.println(requestHeaders);
//
//        User newUser = new User(3L, "James", "Brown", (byte)12);
//
//
//        HttpEntity<User> requestEntity = new HttpEntity<>(newUser, requestHeaders);
//        System.out.println(requestEntity);
////        ResponseEntity<User> response = restTemplate.exchange(URL, HttpMethod.POST, requestEntity, User.class);
////        System.out.println(response.getBody());
//
//
//        return "It`s good for now";
//
//    }
//
////    public String getSessionId() {
////        ResponseEntity<List<User>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
////                new ParameterizedTypeReference<>() {});
////        HttpHeaders headers = responseEntity.getHeaders();
////        System.out.println(headers.getFirst(HttpHeaders.SET_COOKIE));
////        return headers.getFirst(HttpHeaders.SET_COOKIE);
////    }
//
//}
//
