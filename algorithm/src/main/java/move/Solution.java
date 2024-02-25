package move;
public class Solution {
    /*public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }*/

   public boolean Find(int target,int[][] array) {
        int rowCount = array.length;
        int colCount = array[0].length;
        int i,j;
        for(i=rowCount-1,j=0;i>=0&&j<colCount;)
        {
            if(target == array[i][j])
                return true;
            if(target < array[i][j])
            {
                i--;
                continue;//break
            }
            if(target > array[i][j])
            {
                j++;
                continue;//break
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int[][] array= {
               {1, 2, 3, 4, 5, 6, 7},
               {2, 3, 4, 5, 6, 7, 8},
               {3, 4, 5, 6, 7, 8, 9}
       };
        System.out.println(array.length);//列
        System.out.println(array[1].length);//行
       int target=8;
       Solution s=new Solution();
        System.out.println(s.Find(target,array));
    }
}