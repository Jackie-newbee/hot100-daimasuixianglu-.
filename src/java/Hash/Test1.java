package Hash;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 *
 * @Author pine-li
 * @Create 2024/10/11 21:34
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {

        int nums[] = {2,7,11,15};
        int target = 9;
        Test1 test1 = new Test1();
        int result[] = test1.towSum(nums,target);
        System.out.println(Arrays.toString(result));

    }


    /**
     * 暴力法
     *
     */
//    public int[] towSum(int[] nums,int target){
//        int n = nums.length;
//        for (int i=0; i<n;i++){
//            for (int j=i+1; j<n; j++){
//                if(nums[i] + nums[j] == target ){
//                    //返回包含i j的整型数组
//                    return new int[] {i,j};
//                }
//            }
//        }
//        //返回空数组
//        return new int[0];
//    }


    /**
     * 哈希算法
     */
    public int[] towSum(int[] nums,int target){
        int n = nums.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if (hashMap.containsKey(target-nums[i])){
                int j = hashMap.get(target-nums[i]);
                return new int[] {j,i};
            }else {
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];

    }


}



