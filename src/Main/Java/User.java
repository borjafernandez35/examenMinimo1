import java.util.List;

public class User {
    private String name;

    private String surname;

    private String id;

    private int life;



    List<Product>listProduct;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }




    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public User(){}
    public User(String name, String surname, String id, int life) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.life=life;
    }

    public void setId(String id) {
        this.id = id;
    }


}
