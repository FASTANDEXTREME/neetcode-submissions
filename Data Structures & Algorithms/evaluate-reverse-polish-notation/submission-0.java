class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {

            if (!token.equals("+") && !token.equals("-") && !token.equals("/")&& !token.equals("*"))
            {
             stack.push(Integer.parseInt(token));
            }


            else{
                int b = stack.pop();
                int a = stack.pop();

                if(token.equals("+")){
                    int res = b+a;
                    stack.push(res);

                }

                else if(token.equals("-")){
                    int res =a-b;
                    stack.push(res);

                }

                else if(token.equals("/")){
                    int res = a/b;
                    stack.push(res);

                }

                else {
                    int res = b*a;
                    stack.push(res);
                }


            }


        }
        return stack.pop();


    }
}