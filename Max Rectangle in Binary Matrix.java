import java.util.*;

public class Solution {
    public int maximalRectangle(ArrayList<ArrayList<Integer>> matrix) {
        if(matrix == null || matrix.size() == 0 || matrix.get(0).size() == 0) return 0;
        
        int[] height = new int[matrix.get(0).size()];
        for(int i = 0; i < matrix.get(0).size(); i++) {
            if(matrix.get(0).get(i) == 1) height[i] = 1;
        }
        int result = largestInLine(height);
        for(int i = 1; i < matrix.size(); i++) {
            resetHeight(matrix, height, i);
            result = Math.max(result, largestInLine(height));
        }
        
        return result;
    }
    
    private void resetHeight(ArrayList<ArrayList<Integer>> matrix, int[] height, int idx) {
        for(int i = 0; i < matrix.get(0).size(); i++) {
            if(matrix.get(idx).get(i) == 1) height[i] += 1;
            else height[i] = 0;
        }
    }    
    
    public int largestInLine(int[] height) {
        if(height == null || height.length == 0) return 0;
        int len = height.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++) {
            int h = (i == len ? 0 : height[i]);
            if(s.isEmpty() || h >= height[s.peek()]) {
                s.push(i);
            } else {
                int tp = s.pop();
                maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
