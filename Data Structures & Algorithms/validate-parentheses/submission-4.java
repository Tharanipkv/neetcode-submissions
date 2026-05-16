class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> collect = new HashMap<>();
        collect.put('}', '{');
        collect.put(']', '[');
        collect.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(collect.containsKey(c)){
                if(!stack.isEmpty() && stack.peek()==collect.get(c)){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
