package OneTen_Code.twoSum;

/**
 * 本题是力扣热题100的第一题，两数之和
 *
 * 给定一个整数数组 nums和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值target的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 */
public class SolutionBF {
    /**
     * 这里的解决方法是暴力解法，用两个for循环，把每一个参数和可能性都便利一遍
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
