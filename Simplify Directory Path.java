public class Solution {
  public String simplifyPath(String A) {
    Deque<String> stack = new LinkedList<>();
    for (String dir : A.split("/")) { 
      if (dir.isEmpty() || dir.equals(".")) { 
          
        continue;
      } else if (dir.equals("..")) {
        if (!stack.isEmpty()) { // Pop if there's a previous directory
          stack.pop();
        }
      } else {
        stack.push(dir); // Add valid directory to stack
      }
    }
    
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
      result.insert(0, "/" + stack.pop()); // Build path from back to front
    }
    return result.length() == 0 ? "/" : result.toString(); // Ensure single leading slash
  }
}
