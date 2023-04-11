package OneTen_Code.twoSum;

import java.util.HashMap;
import java.util.Map;

public class SolutionMap {
    static int a =1;
    /**
     * 本题是力扣热题100的第一题，两数之和
     *
     * 给定一个整数数组 nums和一个整数目标值 target，
     * 请你在该数组中找出 和为目标值target的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     * 你可以按任意顺序返回答案。
     */
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target-nums[i])){
                    return new int[]{i,map.get(target-nums[i])};
                }map.put(nums[i],i);
            }
            return null;
        }
}