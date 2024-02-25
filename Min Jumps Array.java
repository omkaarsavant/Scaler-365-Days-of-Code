public class Solution {
    public int jump(ArrayList<Integer> A) {
        if (A.size() <= 1)
            return 0;
        if (A.get(0) == 0)
            return -1;

        int maxReach = A.get(0);
        int step = A.get(0);
        int jump = 1;

        for (int i = 1; i < A.size(); i++) {
            if (i == A.size() - 1)
                return jump;

            maxReach = Math.max(maxReach, i + A.get(i));
            step--;

            if (step == 0) {
                jump++;
                if(i >= maxReach)
                   return -1;
                step = maxReach - i;
            }
        }

        return -1;
    }
}
