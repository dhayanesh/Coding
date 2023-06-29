class Solution {
    public String simplifyPath(String path) {
        String result = "";
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");

        for (String str : arr) {
            if (str.equals(".") || str.isEmpty())
                continue;
            else if (str.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else
                stack.push(str);
        }

        while (!stack.isEmpty()) {
            result = "/" + stack.pop() + result;
        }

        return result.isEmpty() ? "/" : result;
    }
}
