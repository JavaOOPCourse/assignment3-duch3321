public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    boolean premium;


    // TODO: constructor
    public StreamingService(String serviceName,int serviceId,double price){
        super(serviceName,serviceId,price);
        this.premium=false;
    }


    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal

        if (getIsActive()){
            if(premium){
                System.out.println("Premium Streaming Service is performing");
            }
            else{System.out.println("Normal Streaming Service is performing");}
        }
        else{System.out.println("Service is not active");}

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        this.premium=true;
        System.out.println("Upgraded to Premium");

    }
}