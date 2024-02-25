package front_controller;

/**
 * Created by mlh on 2018/1/1.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();//
        }else{
            homeView.show();//
        }
    }
}