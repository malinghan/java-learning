package move;

/**
 * Created by mlh on 2017/12/26.
 */
/**
 * 不能经过x=3 y=4
 * 排列组合问题：共有（X+Y）!/X!Y!
 * 11!/5!6!=7*2*3*11=42*11=462
 */

/**
 * /**
 * 功能：有个机器人坐在X*Y网格的左上角，只能向右、向下移动。机器人从（0,0）到（X,Y）有多少种走法。
 * 进阶：假设有些点为“禁区”，机器人不能踏足。找出一条路径，让机器人从左上角移动到右下角。
 */

public class CountOfLoad {
    public static int countOfLoad(int x,int y){
        if(x==0&&y==0){
            return 0;
        }
        if(x*y==0&&(x+y)!=0){
            return 1;
        }
        return countOfLoad(x-1,y)+countOfLoad(x,y-1);
    }

    public static void main(String[] args) {
        System.out.println(countOfLoad(5,6));
    }
}
