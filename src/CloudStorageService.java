public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    boolean premium;


    // TODO: constructor
    public CloudStorageService(String serviceName , int serviceId,double price){
        super(serviceName,serviceId,price);
        this.premium=false;
    }


    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message

        if (this.getIsActive()){
            if(premium){
                System.out.println("Premium Cloud Service is performing");
            }
            else{System.out.println("Normal Cloud Service is performing");}
        }
        else{System.out.println("Cloud Service is not active");}

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message

        this.premium=true;
        System.out.println("Upgraded to Premium");

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("Bill amount : "+getPrice());

    }
}