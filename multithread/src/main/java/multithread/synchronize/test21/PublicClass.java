package multithread.synchronize.test21;

/**
 * @author: linghan.ma
 * @DATE: 2018/1/26
 * @description:
 */
public class PublicClass {
    private String username;

    private String password;

    class PrivateClass{
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
        PublicClass publicClass=new PublicClass();
        publicClass.setUsername("username");
        publicClass.setPassword("password");

        System.out.println(publicClass.getUsername()+" "+publicClass.getPassword());

        PrivateClass privateClass=publicClass.new PrivateClass();//内部类的实例的构造需要外部类辅助
        //public class PrivateClass 可在包外调用

        privateClass.setAge("age");
        privateClass.setAddress("address");

        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());
    }
}
