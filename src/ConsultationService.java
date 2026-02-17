public class ConsultationService extends Service
        implements Billable {

    // TODO: constructor

    public ConsultationService(String serviceName,int serviceId,double price){
        super(serviceName,serviceId,price);
    }


    @Override
    public void performService() {

        // TODO:
        // check active
        // print consultation message
        if(getIsActive()){
            System.out.println("Consultation service active");
        }
        else{System.out.println("Consultation service is not active");}

    }

    @Override
    public void generateBill() {

        // TODO:
        // print billing message

        System.out.println("Bill amount : "+getPrice());

    }
}