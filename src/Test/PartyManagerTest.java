public class PartyManagerTest {
private PartyManager pm;
public void init(){

pm=new PartyManagerImp();
}

    public void addUserTest() {


    init();
        pm.addUser("Borja","Fernandez","x1",100);
        pm.addUser("Fran","Gonzalez","x2",100);
        pm.addUser("Anna","Garcia","x3",100);
        pm.addUser("Macarena","Vazquez","x4",100);
    }

    public static void main(String[] args) {
        PartyManagerTest partyManagerTest=new PartyManagerTest();
        partyManagerTest.addUserTest();

}
