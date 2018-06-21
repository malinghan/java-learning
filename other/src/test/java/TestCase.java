import  org.junit.*;
/**
 * @author: linghan.ma
 * @DATE: 2018/4/12
 * @description:
 */
public class TestCase {

     @Test
    public void testObject(){
        User a=new User();
        a.setName("sa");
        a.setSex("nan");

        User b=a;
        b.setSex("nv");
        System.out.println(b.getSex());
    }
}
