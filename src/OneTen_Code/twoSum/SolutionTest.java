package OneTen_Code.twoSum;

/**
 * 遇到问题多debug
 */
public class SolutionTest {
    public static void main(String[] args) {
        int[] nums ={2,5,7,9};
        int target = 12;
        SolutionBF solutionBF = new SolutionBF();
        int[] ints = solutionBF.twoSum(nums, target);
        System.out.println(ints);
        SolutionMap solutionMap = new SolutionMap();
        int[] ints1 = solutionMap.twoSum(nums,target);
    }
}
