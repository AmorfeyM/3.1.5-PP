package restClient.model;


import lombok.Data;

@Data
public class Role {

    private Long id;

    private String name;

    public Role() { }

    public Role(String name) {
        this.name = name;
    }




    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
