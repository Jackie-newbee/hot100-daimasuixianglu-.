package ShuangZhiZhen;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * @Author pine-li
 * @Create 2024/10/12 21:54
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {

        int nums[] = {0,1,0,3,12};
        Test1 test1 = new Test1();
        int array[] = test1.moveZeroes(nums);
        for (int a1 : array){
            System.out.println(a1);
        }
    }

    /**
     *非零元素全部按顺序前置，剩下的空间位置即是0元素的存放位置
     * @param nums
     * @return
     */
    public int[] moveZeroes(int[] nums) {

        int count = 0;//用于计数0的数量
        int length = nums.length;
        for(int i=0; i<length; i++){
            if (nums[i] != 0){
                nums[count]=nums[i];
                count++;
            }
        }
        for (int i=count;i<length;i++){
            nums[i] = 0;
        }
        return nums;


    }

}
