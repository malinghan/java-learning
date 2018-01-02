package mediator;

/**
 * Created by mlh on 2017/12/31.
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }
   //
    public void sendMessage(String message){
        //communicates with the Mediator whenever it would have otherwise communicated with another Colleague.
        ChatRoom.showMessage(this,message);//keep a reference to its Mediator object

    }
}
