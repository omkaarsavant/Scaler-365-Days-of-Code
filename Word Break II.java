import java.util.*;

public class Solution {
    public String[] wordBreak(String A, String[] B) {
        Set<String> dict = new HashSet<>(Arrays.asList(B));
        List<String> dp[] = new ArrayList[A.length()+1];
        dp[0] = new ArrayList<String>();

        for(int i=0; i<A.length(); i++){
            if(dp[i] == null)
                continue;

            for(int j=i+1; j<=A.length(); j++){
                String sub = A.substring(i, j);
                if(dict.contains(sub)){
                    if(dp[j] == null){
                        dp[j] = new ArrayList<String>();
                    }
                    dp[j].add(sub);
                }
            }
        }

        ArrayList<String> results = new ArrayList<String>();
        if(dp[A.length()] == null)
            return new String[0];

        ArrayList<String> temp = new ArrayList<String>();
        dfs(dp, A.length(), results, temp);
        Collections.sort(results);
        return results.toArray(new String[0]);
    }

    private void dfs(List<String> dp[], int end, ArrayList<String> result, ArrayList<String> tmp){
        if(end <= 0){
            String path = tmp.get(tmp.size()-1);
            for(int i=tmp.size()-2; i>=0; i--)
                path += " " + tmp.get(i);

            result.add(path);
            return;
        }

        for(String str : dp[end]){
            tmp.add(str);
            dfs(dp, end-str.length(), result, tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}
