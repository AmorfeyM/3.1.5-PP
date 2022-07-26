package restClient.model;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class User1 {

   private Long id;

   private String firstName;

   private String lastName;

   private int age;

   private String username;

   private String password;

    private Set<Role> roles = new HashSet<>();

   public User1() {
   }
   public User1(String username, String password) {
      this.username = username;
      this.password = password;
   }




   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + username + '\'' +
              ", roleList=" + roles +
              '}';
   }
}
