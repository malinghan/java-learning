package business_delegate;

/**
 * Created by mlh on 2018/1/1.
 */
public class BusinessDelegate {
     private  BusinessLookUp lookUpService=new BusinessLookUp();
     private BusinessService  businessService;
     private String serviceType;

     public void setServiceType(String serviceType){
         this.serviceType=serviceType;
     }

     public void doTask(){
         businessService=lookUpService.getBusinessService(serviceType);
         businessService.doProcessing();
     }
}
