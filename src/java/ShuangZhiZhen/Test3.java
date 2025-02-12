package ShuangZhiZhen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
 * 同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 输入：nums = [-1,0,1,2,-1,-4]
 * 输出：[[-1,-1,2],[-1,0,1]]
 *
 * @Author pine-li
 * @Create 2024/10/14 19:34
 * @Version 1.0
 */
public class Test3 {

    public static void main(String[] args) {

        int nums[] = {-1,0,1,2,-1,-4};
        Test3 test3 = new Test3();
        List<List<Integer>> listList = test3.threeSum(nums);
        System.out.println(listList);

    }


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listList = new ArrayList<>();
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for (int i=0; i<len; i++){
            if (nums[i]>0){
                return listList;
            }
            if(i>0 && nums[i]==nums[i-1]){//如果有重复的，那就直接下一个
                continue;
            }
            int curr = nums[i];
            int L = i+1, R = len-1;
            while (L < R){
                int tmp = curr + nums[L] +nums[R];
                if(tmp == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    listList.add(list);
                    while (L < R && nums[L+1]==nums[L]){
                        L++;
                    }
                    while (L < R && nums[R-1]==nums[R]){
                        R--;
                    }
                    L++;
                    R--;
                } else if (tmp < 0) {
                    L++;
                }else {
                    R--;
                }
            }

        }
        return listList;

    }


}








