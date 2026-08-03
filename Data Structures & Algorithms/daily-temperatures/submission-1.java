class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
     int[] result = new int[temperatures.length];
        Stack<ArrayList<Integer>> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++)
        {
            int temperature = temperatures[i];
            ArrayList<Integer> temperatureIndex = new ArrayList<Integer>();
            temperatureIndex.add(temperature);
            temperatureIndex.add(i);

            if(!stack.empty()) {
                int stackTemperature = stack.peek().get(0);
                while(stackTemperature < temperatures[i])
                {
                    // update result
                    result[stack.peek().get(1)] = i - stack.peek().get(1);
                    stack.pop();
                    if(stack.empty()) break;
                    stackTemperature = stack.peek().get(0);
                }

                stack.push(temperatureIndex);

            }
            else{
                stack.add(temperatureIndex);
            }

        }

        return result;
    }
}
