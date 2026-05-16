class Solution {
    public boolean isValid(String s) {

        // Stack<Character> stack = new Stack<>();
        // Map<Character, Character> collect = new HashMap<>();

        // collect.put('}' , '{');
        // collect.put(']' , '[');
        // collect.put(')' , '(');

        // for(char c: s.toCharArray()){
        //     if(collect.containsKey(c)){
        //         if(!stack.isEmpty() && stack.peek()==collect.get(c)){
        //             stack.pop();
        //         }
        //         else{
        //             return false;
        //         }
        //     }
        //     else{
        //         stack.push(c);
        //     }
        // }
        // return stack.isEmpty();
       Stack<Character> stack = new Stack<>();
       Map<Character, Character> collect = new HashMap<>();
       collect.put('}' , '{');
       collect.put(']' , '[');
       collect.put(')' , '(');

       for(char c : s.toCharArray()){
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
