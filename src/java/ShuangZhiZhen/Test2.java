package ShuangZhiZhen;

/**
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量
 *
 * @Author pine-li
 * @Create 2024/10/14 14:56
 * @Version 1.0
 */
public class Test2 {

    public static void main(String[] args) {

        int height[] = {1,8,6,2,5,4,8,3,7};
        Test2 test2 = new Test2();
        System.out.println(test2.maxArea1(height));

    }


    /**
     * 暴力法（运行超时了）
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int maxValue = 0;//容器存储的最大水量
        int length = height.length;
        for (int i=0; i<length-1; i++){
            for (int j=i+1; j<length; j++){
                int value = (j-i)*Math.min(height[i],height[j]);
                if (maxValue < value){
                    maxValue = value;
                }
            }
        }
        return maxValue;

    }


    /**
     * 双指针位于数组的两头，然后由短的那一侧的指针向内移动，直到两个指针相遇
     */
    public int maxArea1(int[] height) {

        int a=0, b=height.length-1;
        int maxValue = 0;//容器存储的最大水量
        while (a < b){
            if (height[a] < height[b]){
                maxValue = Math.max(maxValue,(b - a) * height[a]);
                a++;
            }else {
               maxValue = Math.max(maxValue,(b - a) * height[b]);
                b--;
            }
        }
        return maxValue;
    }









}
