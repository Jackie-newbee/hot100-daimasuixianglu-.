package ZiChuan;

import java.util.HashMap;

/**
 * 560. 和为 K 的子数组
 *
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 *子数组是数组中元素的连续非空序列。
 *
 * 输入：nums = [1,1,1], k = 2
 * 输出：2
 *
 * @Author pine-li
 * @Create 2024/10/20 14:20
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {
        int nums[] = {1,1,1};
        int k =2;
        Test1 test1 = new Test1();
        System.out.println(test1.subarraySum(nums,k));

    }

    /**
     * 暴力法：定义left right两个指针，left从nums[0]滑到最后一个
     * 然后right从left开始向右滑，滑到他俩之间的之数组和>=K时为止
     *
     */
    public int subarraySum1(int[] nums, int k) {

        int count = 0;
        for (int left=0; left<nums.length; left++){
            int sum = 0;
            for (int right=left; right<nums.length; right++){
                sum = sum + nums[right];
                if (sum==k){
                    count++;
                }
            }
        }
        return count;

    }

    /**
     * 前缀和 + 哈希表
     */
    public int subarraySum(int[] nums, int k) {

        int count =0, pre =0;//pre是前缀和
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i=0; i<nums.length; i++){
            pre = pre + nums[i];
            if (map.containsKey(pre-k)){
                count = count + map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);

        }
        return count;

    }





}
