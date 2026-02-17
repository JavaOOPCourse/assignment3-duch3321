public abstract class Service {

    // TODO: declare private fields
    // serviceName
    private String serviceName;
    // serviceId
    private int serviceId;
    // isActive
    private boolean isActive;
    private double price;


    // TODO: constructor
    public Service(String serviceName,int serviceId,double price){
        this.serviceName=serviceName;
        this.serviceId=serviceId;
        this.isActive=false;
        this.price=price;
    }


    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService(){
        this.isActive=true;
        System.out.println("Service is activated");
    }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService(){
        this.isActive=false;
        System.out.println("Service is deactivated");
    }

    // TODO: getter for serviceName
    public String getServiceName(){
        return (this.serviceName);
    }


    // TODO: getter for isActive
    public boolean getIsActive(){
        return (this.isActive);
    }

    public double getPrice(){return (this.price);}


    // TODO: abstract method performService()
    public abstract void performService();


    @Override
    public String toString() {
        return this.serviceName + " , ID: " + this.serviceId;
    }


}