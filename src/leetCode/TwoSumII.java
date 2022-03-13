package leetCode;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;

        while (numbers[i]+numbers[j] != target){
            if (numbers[i]+numbers[j] > target)
                j--;
            else
                i++;
        }
        result[0] = i+1;
        result[1] = j+1;

        return result;
    }
}
