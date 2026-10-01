class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack=new Stack<>();
        int answer[]=new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                   int pre_index=stack.pop();
                   answer[pre_index]=i-pre_index;
            }
            stack.push(i);
        }
        return answer;
    }
}
