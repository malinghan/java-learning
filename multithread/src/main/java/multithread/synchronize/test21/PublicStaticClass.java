package multithread.synchronize.test21;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class PublicStaticClass {


    static private String username;

    static private String password;

    static class PrivateClass{
        private String age;
        private String address;

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void printPublicProperty(){
            System.out.println(username+" "+address);
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public static void main(String[] args) {
        PublicStaticClass publicClass=new PublicStaticClass();
        publicClass.setUsername("username");
        publicClass.setPassword("password");

        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());

        PrivateClass privateClass=new PrivateClass();//静态内部类不需要外部构造，可以直接new！

        privateClass.setAge("age");
        privateClass.setAddress("address");

        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());
    }
}
