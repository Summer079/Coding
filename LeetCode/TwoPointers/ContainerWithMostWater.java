package TwoPointers;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {


		int left = 0;
		int right = height.length - 1;
		int cur = 0;
		int globalMax = 0;
		while (left < right) {
			if (height[left] >= height[right]) { 
				cur = height[right] * (right - left);
				right--;
			}else {
				cur = height[left] * (right - left);
				left++;
			}
			if (cur > globalMax) {
				globalMax = cur;
			}
		}
		return globalMax;
	}

	public static void main(String[] args) {
		ContainerWithMostWater solution = new ContainerWithMostWater();
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int maxArea = solution.maxArea(height);
		System.out.println("Max area of water that can be contained: " + maxArea);
	}
}