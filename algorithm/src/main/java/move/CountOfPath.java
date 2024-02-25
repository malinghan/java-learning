package move;
import java.util.*;

/**
 * Created by mlh on 2017/12/26.
 */

/**
 * 不经过 x=3 y=4
 */
public class CountOfPath {
     public static int countOfPath(int x,int y){
         if(x==0&&y==0)
               return 0;
         if(x*y==0&&(x+y)!=0)
             return 1;
         if(x==3&&y==4){

         }
         return countOfPath(x-1,y)+countOfPath(x,y-1);
     }

    public static void main(String[] args) {

    }
}

