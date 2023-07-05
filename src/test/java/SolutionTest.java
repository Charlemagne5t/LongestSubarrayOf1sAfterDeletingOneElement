import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void longestSubarrayTest1() {
        int[] nums = {1, 1, 0, 1};
        int expected = 3;
        int actual = new Solution().longestSubarray(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void longestSubarrayTest2() {
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        int expected = 5;
        int actual = new Solution().longestSubarray(nums);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void longestSubarrayTest3() {
        int[] nums = {1, 1, 1};
        int expected = 2;
        int actual = new Solution().longestSubarray(nums);
        Assertions.assertEquals(expected, actual);
    }
}
