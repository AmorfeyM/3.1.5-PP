package restClient.model;

public class User {

   private Long id;
   private String name;
   private String lastName;
   private Byte age;

   public User() {
   }
   public User(Long id, String name, String lastName, byte age) {
      this.id = id;
      this.name = name;
      this.lastName = lastName;
      this.age = age;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", firstName='" + name + '\'' +
              ", lastName='" + lastName + '\'' +
              ", age=" + age +
              '}';
   }
}


