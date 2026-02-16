public class Customer extends User {

    // TODO: constructor
    public Customer(String name, int id){
        super(name,id);
    }


    @Override
    public void manageService(Service s) {

        // TODO:
        // print that customer cannot manage services

        System.out.println("Customer cannot manage services");

    }

    @Override
    public void useService(Service s) {

        // TODO:
        // print customer using message
        // call performService()

        System.out.println("Customer is using service ");
        s.performService();

    }
}