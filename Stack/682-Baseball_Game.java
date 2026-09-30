class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String i:operations){
            if(i.equals("C")){
                stack.pop();
            }
            else if(i.equals("+")){
                int first=stack.pop();
                int second= stack.peek();

                stack.push(first);
                stack.push(first+second);
            }
            else if(i.equals("D")){
                stack.push(stack.peek()*2);
            }
            else{
                stack.push(Integer.parseInt(i));
            }
        }
           int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }

        return sum;
    }
}
