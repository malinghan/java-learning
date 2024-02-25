package business_delegate;

/**
 * Created by mlh on 2018/1/1.
 */
public class BusinessDelegatePatternDemo     {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();

        businessDelegate.setServiceType("EJB");//设置具体业务类型

        Client client = new Client(businessDelegate);

        client.doTask();

        businessDelegate.setServiceType("JMS");

        client.doTask();
    }
}
