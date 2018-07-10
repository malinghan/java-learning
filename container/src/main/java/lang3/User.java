package lang3;

/**
 * @author: linghan.ma
 * @DATE: 2018/7/10
 * @description:
 */
public class User {
    private String name;
    private int age;


    public User(){}

     public static class Builder{
         private String name;
         private int age;

         public Builder(){

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        //toStringBuild()
        return "name:"+name+"";
    }



}
