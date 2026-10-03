
class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char [] chars = s.toCharArray();

        for(int i =0; i<chars.length;i++){


            if(chars[i]==']'||chars[i]=='}'||chars[i]==')'){

                if (stack.isEmpty()) {
                    return false;
                }
                
                if(chars[i]==']' && stack.peek()=='['){
                    stack.pop();
                }
                else if(chars[i]=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                else if(chars[i]==')' && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }

            }
            else{
                stack.push(chars[i]);
            }

        }
        return stack.isEmpty();

    }
}