import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ArrayList<TreeNode> generateTrees(int A) {
        return generateTrees(1, A);
    }

    private ArrayList<TreeNode> generateTrees(int start, int end) {
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        if (start > end) {
            list.add(null);
            return list;
        }

        for (int i = start; i <= end; i++) {
            ArrayList<TreeNode> leftList = generateTrees(start, i - 1);
            ArrayList<TreeNode> rightList = generateTrees(i + 1, end);
            for (int j = 0; j < leftList.size(); j++) {
                for (int k = 0; k < rightList.size(); k++) {
                    TreeNode node = new TreeNode(i);
                    node.left = leftList.get(j);
                    node.right = rightList.get(k);
                    list.add(node);
                }
            }
        }
        return list;
    }
}
