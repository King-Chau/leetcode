import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] splits = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String split : splits) {
            if ("..".equals(split)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (split.length() > 0 && !".".equals(split)) {
                stack.push(split);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        List<String> items = new ArrayList<>();
        while (!stack.isEmpty()) {
            items.add(stack.pop());
        }
        Collections.reverse(items);
        String res = String.join("/", items);
        return "/" + res;
    }
}
