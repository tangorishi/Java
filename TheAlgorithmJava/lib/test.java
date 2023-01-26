import org.junit.Test;
import static org.junit.Assert.*;

public class MedianTest {
    @Test
    public void testMedianOfTwoArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expected = 2.0;
        double result = findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testMedianOfTwoArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double expected = 2.5;
        double result = findMedianSortedArrays(nums1, nums2);
        assertEquals(expected, result, 0.0);
    }
}
