package mocktest1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZero {
    public  static  void moveZeroes(int[] nums) {

        int lastNonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[lastNonZero];
                nums[lastNonZero]=temp;

                lastNonZero+=1;
            }
        }
    }

    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        int []n={0};
        moveZeroes(n);
        System.out.println(Arrays.toString(n));

    }

}
