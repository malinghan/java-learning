package business_delegate;

/**
 * Created by mlh on 2018/1/1.
 */
public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate  businessDelegate){
         this.businessDelegate=businessDelegate;
    }

    public void doTask(){
        businessDelegate.doTask();
    }
}
