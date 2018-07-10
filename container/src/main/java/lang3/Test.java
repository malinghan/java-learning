package lang3;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.*;

/**
 * @author: linghan.ma
 * @DATE: 2018/7/10
 * @description:
 */
public class Test {
    //
    @org.junit.Test
    public void testBooleanUtils(){
        User u = new User();
        Object d=null;
        //如果这个Object为null,则返回default值
        //System.out.println(ObjectUtils.defaultIfNull(null,"sasas"));
        //返回这个列表中不为null的Object
        //System.out.println(ObjectUtils.firstNonNull(null,"sasas","asasa","sasasa"));
        //
        ObjectUtils.clone(d);
        ObjectUtils.cloneIfPossible(d);
        ObjectUtils.identityToString(d);

        System.out.println(StringUtils.difference("asaaa","aasaa"));



    }

}
