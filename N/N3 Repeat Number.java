import java.util.*;

public class Solution {
    
    public int repeatedNumber(final List<Integer> a) {
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;

        for (int num : a) {
            if (candidate1 != null && num == candidate1.intValue()) {
                count1++;
            } else if (candidate2 != null && num == candidate2.intValue()) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : a) {
            if (candidate1 != null && num == candidate1.intValue()) count1++;
            if (candidate2 != null && num == candidate2.intValue()) count2++;
        }

        if (count1 > a.size() / 3) return candidate1;
        if (count2 > a.size() / 3) return candidate2;
        return -1;
    }
}
