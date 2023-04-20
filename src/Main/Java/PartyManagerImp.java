import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PartyManagerImp implements PartyManager{

    private int numusers;
    List<User>users;
    List<Product>products;



    final static Logger logger = Logger.getLogger(PartyManagerImp.class);

    public PartyManagerImp() {
        this.products = new ArrayList<>();
        this.products.add(new Product("dinero","añade 5 puntos de vida","5dsaCoins"));
        this.products.add(new Product("sarcofago","añade 10 puntos de vida","55dsaCoins"));
        this.products.add(new Product("varita","añade 15 puntos de vida","65dsaCoins"));





    }

    @Override
    public void addUser(String name, String surname, String id, int life) {


            User user = new User();
            user.setName(name);
            user.setSurname(surname);
            user.setId(id);
            user.setLife(life);
            products.get(numusers).getPrice()=25dsaCoins;

            this.users.add(user);
            logger.info ("this user is added");
            this.numusers+=1;
        }




    @Override
    public void addProduct(String id, String description, String price) {

        Product product=new Product();
        product.setId(id);
        product.setDescription(description);
        product.setPrice(price);


    }

    @Override
    public boolean initParty(String id) {


    }

    @Override
    public void createParty() {

    }

    @Override
    public void stateParty() {

    }

    @Override
    public void update() {

    }

    @Override
    public void actuaLife() {

    }

    @Override
    public void consultTeamLife() {

    }

    @Override
    public void endParty() {

    }
}
